#!/bin/bash

# Open the first terminal window and run the specified command
osascript -e 'tell application "Terminal" to do script "cd atlassian-bitbucket-pipelines-runner/bin && ./start.sh --accountUuid {e5f43525-a351-4afb-a1d6-1a5938918ef2} --repositoryUuid {657ed945-3b41-4a9e-ad40-8b6bf36811ad} --runnerUuid {0344f823-9d22-577d-bba2-b8d45e08c92f} --OAuthClientId pf7A3r99nxT6uh7muA6PgPtT6LVV1whr --OAuthClientSecret ATOA2FRzkqeC7ml0RaUrpilBcbcf-TLwXFXCEGX8S9M58gaiWd_RZF73YzMS_xyZgSGTC1F0C4C9 --runtime macos-bash --workingDirectory ../temp"'

# Wait for a few seconds to allow the first terminal to execute the command
sleep 5

# Open the second terminal window and run another Appium command (replace with your specific command)
osascript -e 'tell application "Terminal" to do script "cd atlassian-bitbucket-pipelines-runner/bin && ./start.sh --accountUuid {e5f43525-a351-4afb-a1d6-1a5938918ef2} --repositoryUuid {657ed945-3b41-4a9e-ad40-8b6bf36811ad} --runnerUuid {2fc466f4-5f38-55a5-a192-3015b0ce82ff} --OAuthClientId WvoPoC728Iy4HXEtkFJC8ShuxIQzJKdy --OAuthClientSecret ATOAMWBHINpPM7Qu_mMTo_TzLGSnZWJWGej0ueeTx3Kj5s9h_-ywlcICDdDwuutIHFdr349FFAFA --runtime macos-bash --workingDirectory ../temp"'

sleep 5

osascript -e 'tell application "Terminal" to do script "cd atlassian-bitbucket-pipelines-runner/bin && ./start.sh --accountUuid {e5f43525-a351-4afb-a1d6-1a5938918ef2} --repositoryUuid {67a90ec4-7b32-49eb-a846-45b07f95c55c} --runnerUuid {c6d32807-7b69-5e5d-9e4f-9d53cdc52074} --OAuthClientId rskDZ5pZRQBogh8kEaqKbDsfW0JHBUbV --OAuthClientSecret ATOAJ7PCSGh496vo4rowvCLmriSBz4EsQEKbEEUiLQk36Wbn8FR9GmDW18iV_ileoTHz01F5A6FD --runtime macos-bash --workingDirectory ../temp"'

