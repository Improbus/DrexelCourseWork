#!/bin/bash


sign < words | sort | awk -f squash.awk > out

awk '{ print NF " " $0}' < out | sort -n | tail
