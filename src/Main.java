public class Main {
    public static void main(String[] args) {
        System.out.print("Please Enter Pattern: ");
        try {
            String pattern = Service.patternValidate(Service.scanner.next());
            for (Character character : pattern.toCharArray()) {
                Service.stack.push(character);
                Service.found = false;
                if (Service.stack.size() == 1) continue;
                for (int i = Service.stack.size() - 2; i >= 0; i--) {
                    switch (character) {
                        case 'R':
                            if (Service.stack.elementAt(i) == 'L')
                                Service.search(character, Service.stack.elementAt(i));
                            break;
                        case 'L':
                            if (Service.stack.elementAt(i) == 'R')
                                Service.search(character, Service.stack.elementAt(i));
                            break;
                        case 'U':
                            if (Service.stack.elementAt(i) == 'D')
                                Service.search(character, Service.stack.elementAt(i));
                            break;
                        case 'D':
                            if (Service.stack.elementAt(i) == 'U')
                                Service.search(character, Service.stack.elementAt(i));
                            break;
                    }
                    if (Service.found) break;
                }
            }
            System.out.println(Service.count);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}