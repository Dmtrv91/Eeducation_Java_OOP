package Test;

class Main implements Command {
    @Override
    public void execute(StudentRepository repository, String[] args){
        System.out.println("New COMMAND");
    }
}
