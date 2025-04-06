package org.example.week9.d4.e3;

public class E3MethodOverloading {


    public static void main(String[] args) {

        class SecuritySystem {


            private void authenticate() {
                System.out.println("Authenticating with password");
            }

            private void authenticate(int otp) {
                System.out.println("Authenticating with OTP: " + otp);
            }

            public void performAuthentication() {
                authenticate(); // Calls password-based authentication
                authenticate(123456);

            }
        }
        SecuritySystem security = new SecuritySystem();
        security.performAuthentication();
    }
}
