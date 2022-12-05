# Calculator
## Design Pattern
Command, State
## Description
This calculator has 5 commands:
- add;
- subtract;
- multiply;
- divide (if divider is 0, the exception will be thrown);
- undo (reverts changes of the recent applied command);

These commands change calculator state (operations result).