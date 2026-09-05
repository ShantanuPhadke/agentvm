package agentvm;

public enum TokenType {
    // Punctuation
    LEFT_PAREN, RIGHT_PAREN,
    LEFT_BRACE, RIGHT_BRACE,
    LEFT_BRACKET, RIGHT_BRACKET,
    COMMA,
    DOT,
    COLON,
    SEMICOLON,

     // Operators
    PLUS,
    MINUS,
    STAR,
    SLASH,
    BANG,
    EQUAL,
    GREATER,
    LESS,

    // One or two character operators
    BANG_EQUAL,
    EQUAL_EQUAL,
    GREATER_EQUAL,
    LESS_EQUAL,
    FAT_ARROW,


    // Literals
    IDENTIFIER,
    STRING,
    NUMBER,

    // AgentScript keywords
    AGENT,
    GOAL,
    TOOLS,
    BUDGET,
    PERMISSIONS,
    RECOVER,
    RETRY,
    CHECKPOINT,
    AFTER,

    // Generic literals
    TRUE,
    FALSE,
    NIL,

    EOF
}
