# Claude

Claude setup document for humans.

## Setup
1. Follow [this guide on Confluence](https://mendix.atlassian.net/wiki/x/eAG7EwE) to set up Claude Code.
2. Download and install [Claude Code](https://code.claude.com/docs/en/overview#vs-code) (if not done already) and / or install the [Claude VSCode extension](https://marketplace.visualstudio.com/items?itemName=anthropic.claude-code) in VSCode
3. Create a file called `settings.local.json` in this directory (`.claude`) with the following contents:
    ```json
    {
        "awsAuthRefresh": "aws sso login --profile <my-sandbox-profile>",
        "env": {
            "AWS_PROFILE": "<my-sandbox-profile>"
        }
    }
    ```
    and replace `<my-sandbox-profile>` with the name of your AWS sandbox profile, created in step 1.
    This file is already git-ignored.

    The `awsAuthRefresh` entry automatically refreshes the AWS token when it expires.

4. Profit!
