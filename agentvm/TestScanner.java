package agentvm;

public class TestScanner {
    public static void main (String [] args) {
        // Sanity Check
        String sourcecode1 = "10 + 20 / 2;";
        Scanner scanner1 = new Scanner(sourcecode1);

        for (Token token : scanner1.scanTokens()) {
            System.out.println(token);
        }

        System.out.println("\n\n\n");

        // Basic AgentScript program
        String sourcecode2 = """
            agent Engineer {
                goal fix_issue;

                tools {
                    read_file;
                    shell;
                }

                budget {
                    steps: 50;
                    cost: 5.0;
                }

                recover {
                    tool_error => retry(3);
                }

                checkpoint after side_effect;
            }
        """;
        Scanner scanner2 = new Scanner(sourcecode2);
        for (Token token : scanner2.scanTokens()) {
            System.out.println(token);
        }
    }
}
