#!/bin/sh

ps ux | grep "data-query.jar" | grep -v grep | grep -v stop.sh | cut -c 9-15 | xargs kill

echo "stopped!"
