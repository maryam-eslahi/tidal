terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "~> 2.70"
    }
  }
}

# Create an aws Provider
provider "aws" {
  region = "us-west-2"
}

# Create elb security groups 
resource "aws_security_group" "elb_security_group" {
  name        = "elb_security_group"
  description = "elb Security Group"
  vpc_id      = "vpc-11111111" 

  ingress {
    description = "Access to port 443"
    from_port   = 443
	to_port     = 443
    protocol    = "https"
    cidr_blocks = ["0.0.0.0/0"]
  }

  egress {
    from_port   = 0
    to_port     = 0
    protocol    = "-1"
    cidr_blocks = ["0.0.0.0/0"]
  }

  tags = {
    Service = "test_service"
  }
}

# Create load balancer
resource "aws_elb" "aws_elb_tidal" {
  name               = "aws_elb_tidal"
  vpc_id             = "vpc-11111111"   
  subnets            = [ "subnet-aaaaaaaa", "subnet-bbbbbbbb" ]
  availability_zones = ["us-west-2a", "us-west-2b", "us-west-2c"]
  security_groups    = 

  access_logs {
    bucket        = "tidal-logs"
    bucket_prefix = "elb/aws_elb_tidal"
    interval      = 5
  }


  listener {
    instance_port      = 8080
    instance_protocol  = "http"
    lb_port            = 443
    lb_protocol        = "https"
    ssl_certificate_id = "arn:aws:iam::123456789012:server-certificate/certName"  
  }

  health_check {
    healthy_threshold   = 3
    unhealthy_threshold = 3
    timeout             = 2
    target              = "HTTP:8080/health"
    interval            = 10
  }

  tags = {
    Service = "test_service"
  }
}

# Create application security group
resource "aws_security_group" "application_security_group" {
  name        = "application_security_group"
  description = "Application Security Group"
  vpc_id      = "vpc-11111111" 

  ingress {
    description     = "Access from elb_security_group"
    from_port       = 8080
    protocol        = "http"
	security_groups = [aws_security_group.elb_security_group.id]
    cidr_blocks = ["0.0.0.0/0"]
  }

  egress {
    from_port   = 0
    to_port     = 0
    protocol    = "-1"
    cidr_blocks = ["0.0.0.0/0"]
  }

  tags = {
    Service = "test_service"
  }
}


