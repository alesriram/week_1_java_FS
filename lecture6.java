
    interface OlaCustomer{
        void bookCab();
        void findARide();
        void RentCab();
        void rateDriver();
        void ScheduleCab();
        void CanceCab();
        void AddMoneyToWallet();
        void RiseComplaint();
        void signUp();
        void signIn();
    }

    interface OlaDriver{
        void accepBooking();
        void GetCustomerLocation();
        void SetStatus();
        void GetMyComission();
        void RaiseMoneyTransferRequest();
        void CallCustomer();
        void SetupYourVehicle();
        void CustomerFeedback();
    }

    interface OlaOwner{
        void GetDriverRecords();
        void GetReportByDriverId();
        void GetReportByRegion();
        void GetTotalRevenue();
        void GetCustomersFeedback();
        void AddDriver();
        void RemoveDriver();
        void AddDriverStatus();
    }
public class Lecture6 implements OlaCustomer,OlaDriver,OlaOwner{
        public static void main(String[] args){
            OlaOwner vamsi=new Lecture6();
		vamsi.AddDriver();
		OlaCustomer ram=new Lecture6();
		ram.bookCab();
		OlaDriver raj=new Lecture6();
		raj.CallCustomer();
        }

        @Override
        public void GetDriverRecords() {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void GetReportByDriverId() {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void GetReportByRegion() {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void GetTotalRevenue() {
            // TODO Auto-generated method stub
        }

        @Override
        public void GetCustomersFeedback() {
            // TODO Auto-generated method stub
        }

        @Override
        public void AddDriver() {
            // TODO Auto-generated method stub
        }

        @Override
        public void RemoveDriver() {
            // TODO Auto-generated method stub
        }

        @Override
        public void AddDriverStatus() {
            // TODO Auto-generated method stub
        }

        @Override
        public void accepBooking() {
            // TODO Auto-generated method stub
        }

        @Override
        public void GetCustomerLocation() {
            // TODO Auto-generated method stub
        }

        @Override
        public void SetStatus() {
            // TODO Auto-generated method stub
        }

        @Override
        public void GetMyComission() {
            // TODO Auto-generated method stub
        }

        @Override
        public void RaiseMoneyTransferRequest() {
            // TODO Auto-generated method stub
        }

        @Override
        public void CallCustomer() {
            // TODO Auto-generated method stub
        }

        @Override
        public void SetupYourVehicle() {
            // TODO Auto-generated method stub
        }

        @Override
        public void CustomerFeedback() {
            // TODO Auto-generated method stub
        }

        @Override
        public void bookCab() {
            // TODO Auto-generated method stub
        }

        @Override
        public void findARide() {
            // TODO Auto-generated method stub
        }

        @Override
        public void RentCab() {
            // TODO Auto-generated method stub
        }

        @Override
        public void rateDriver() {
            // TODO Auto-generated method stub
        }

        @Override
        public void ScheduleCab() {
            // TODO Auto-generated method stub
        }

        @Override
        public void CanceCab() {
            // TODO Auto-generated method stub
        }

        @Override
        public void AddMoneyToWallet() {
            // TODO Auto-generated method stub
        }

        @Override
        public void RiseComplaint() {
            // TODO Auto-generated method stub
        }

        @Override
        public void signUp() {
            // TODO Auto-generated method stub
        }

        @Override
        public void signIn() {
            // TODO Auto-generated method stub
        }
}
