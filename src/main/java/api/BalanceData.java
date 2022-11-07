package api;

import lombok.Data;



@Data
public class BalanceData {
        private String type;

        public String getType() {
                return type;
        }

        public void setType(String type) {
                this.type = type;
        }

        public String getCurrency() {
                return currency;
        }

        public void setCurrency(String currency) {
                this.currency = currency;
        }

        public int getAmount() {
                return amount;
        }

        public void setAmount(int amount) {
                this.amount = amount;
        }

        public boolean isSuccess() {
                return success;
        }

        public void setSuccess(boolean success) {
                this.success = success;
        }

        public Object getNext() {
                return next;
        }

        public void setNext(Object next) {
                this.next = next;
        }

        public String getRequest_id() {
                return request_id;
        }

        public void setRequest_id(String request_id) {
                this.request_id = request_id;
        }

        public int getProcessing_time() {
                return processing_time;
        }

        public void setProcessing_time(int processing_time) {
                this.processing_time = processing_time;
        }

        private String currency;
        private int amount;
        private boolean success;
        private Object next;
        private String request_id;
        private int processing_time;


}
