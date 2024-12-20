package October_2024._16102024_static_and_Enum.Enum;

public enum APIConstantsEndpoints {
        BASE_URL("https://app.vwo.com"),
        LOGIN_PAGE("https://app.vwo.com/login"),
        DASHBOARD_PAGE("https://app.vwo.com/dasHboard"),
        CHATBOT_PAGE("https://app.vwo.com/chat");


        private String name;

        APIConstantsEndpoints(String name) {
            this.name = name;
        }

        String getValue() {
            return name;
        }
    }

