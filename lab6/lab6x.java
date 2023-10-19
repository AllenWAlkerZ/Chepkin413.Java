
    import java.util.Scanner;

    public class lab6x {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите ежегодную процентную ставку: ");
            double annualInterestRate = scanner.nextDouble();

            System.out.print("Введите сумму кредита: ");
            double loanAmount = scanner.nextDouble();

            System.out.print("Введите количество лет: ");
            int numberOfYears = scanner.nextInt();

            double monthlyInterestRate = annualInterestRate / 12 / 100;
            int numberOfMonths = numberOfYears * 12;

            double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfMonths));
            double totalPayment = monthlyPayment * numberOfMonths;

            System.out.println("Ежемесячный платеж: " + monthlyPayment);
            System.out.println("Общая стоимость кредита: " + totalPayment);
        }
    }

