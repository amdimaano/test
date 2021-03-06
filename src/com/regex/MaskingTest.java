package com.regex;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class MaskingTest {

	@Test
	public void testMask() {
		String jsonString = "{\r\n" + "    \"accommodations\": [\r\n" + "        {\r\n"
				+ "            \"pointsPaymentReferences\": [\r\n" + "                \"I:432704136728.005\"\r\n"
				+ "            ],\r\n" + "            \"guests\": [\r\n" + "                {\r\n"
				+ "                    \"guestOfMember\": false,\r\n"
				+ "                    \"primaryGuest\": false,\r\n" + "                    \"guestDetails\": {\r\n"
				+ "                        \"firstName\": \"MODIFY GUEST\",\r\n"
				+ "                        \"lastName\": \"FIX TEST B\",\r\n"
				+ "                        \"middleName\": \"A\",\r\n"
				+ "                        \"ssn4Digits\": null,\r\n" + "                        \"suffixes\": [],\r\n"
				+ "                        \"titles\": [\r\n" + "                            \"Mr.\"\r\n"
				+ "                        ],\r\n" + "                        \"languagePreference\": \"eng\",\r\n"
				+ "                        \"addresses\": [\r\n" + "                            {\r\n"
				+ "                                \"address1\": \"250 Celebration Pl\",\r\n"
				+ "                                \"address2\": null,\r\n"
				+ "                                \"address3\": null,\r\n"
				+ "                                \"city\": \"Celebration\",\r\n"
				+ "                                \"state\": \"FL\",\r\n"
				+ "                                \"postal\": \"34747\",\r\n"
				+ "                                \"country\": \"USA\",\r\n"
				+ "                                \"addressType\": \"UNKNOWN\",\r\n"
				+ "                                \"primary\": false\r\n" + "                            }\r\n"
				+ "                        ],\r\n" + "                        \"emailLists\": [\r\n"
				+ "                            {\r\n"
				+ "                                \"emailAddress\": \"dom6000053@autotest.com\",\r\n"
				+ "                                \"primary\": false\r\n" + "                            }\r\n"
				+ "                        ],\r\n" + "                        \"phoneLists\": [\r\n"
				+ "                            {\r\n"
				+ "                                \"phoneNumber\": \"4075551245\",\r\n"
				+ "                                \"phoneType\": \"UNKNOWN\",\r\n"
				+ "                                \"ext\": \"0\",\r\n"
				+ "                                \"primary\": false\r\n" + "                            }\r\n"
				+ "                        ],\r\n" + "                        \"guestIdReferences\": [\r\n"
				+ "                            {\r\n" + "                                \"guestIdType\": null,\r\n"
				+ "                                \"guestIdValue\": \"355732116\"\r\n"
				+ "                            }\r\n" + "                        ],\r\n"
				+ "                        \"age\": 0,\r\n" + "                        \"ageType\": \"A\"\r\n"
				+ "                    }\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"guestOfMember\": false,\r\n"
				+ "                    \"primaryGuest\": false,\r\n" + "                    \"guestDetails\": {\r\n"
				+ "                        \"firstName\": \"ARVIN\",\r\n"
				+ "                        \"lastName\": \"DIMAANO\",\r\n"
				+ "                        \"middleName\": \"M\",\r\n"
				+ "                        \"ssn4Digits\": null,\r\n" + "                        \"suffixes\": [],\r\n"
				+ "                        \"titles\": [\r\n" + "                            \"Mr.\"\r\n"
				+ "                        ],\r\n" + "                        \"languagePreference\": \"eng\",\r\n"
				+ "                        \"addresses\": [],\r\n" + "                        \"emailLists\": [\r\n"
				+ "                            {\r\n"
				+ "                                \"emailAddress\": \"test@test.com\",\r\n"
				+ "                                \"primary\": false\r\n" + "                            }\r\n"
				+ "                        ],\r\n" + "                        \"phoneLists\": [\r\n"
				+ "                            {\r\n"
				+ "                                \"phoneNumber\": \"1234567890\",\r\n"
				+ "                                \"phoneType\": \"UNKNOWN\",\r\n"
				+ "                                \"ext\": \"0\",\r\n"
				+ "                                \"primary\": false\r\n" + "                            }\r\n"
				+ "                        ],\r\n" + "                        \"guestIdReferences\": [\r\n"
				+ "                            {\r\n" + "                                \"guestIdType\": null,\r\n"
				+ "                                \"guestIdValue\": \"355732117\"\r\n"
				+ "                            }\r\n" + "                        ],\r\n"
				+ "                        \"age\": 0,\r\n" + "                        \"ageType\": \"A\"\r\n"
				+ "                    }\r\n" + "                }\r\n" + "            ],\r\n"
				+ "            \"dailyRates\": [\r\n" + "                {\r\n"
				+ "                    \"serviceDate\": \"2019-01-14T00:00:00.000-05:00\",\r\n"
				+ "                    \"dailyPoints\": 16,\r\n" + "                    \"availabilityCount\": 1\r\n"
				+ "                }\r\n" + "            ],\r\n" + "            \"specialRequests\": [],\r\n"
				+ "            \"travelComponentGroupingId\": 481712232107,\r\n"
				+ "            \"status\": \"CANCELLED\",\r\n" + "            \"reservationType\": \"MP\",\r\n"
				+ "            \"facilityId\": \"AULV\",\r\n" + "            \"roomTypeCode\": \"V6\",\r\n"
				+ "            \"arrivalDate\": \"2019-01-14T00:00:00.000-05:00\",\r\n"
				+ "            \"departDate\": \"2019-01-15T00:00:00.000-05:00\",\r\n"
				+ "            \"packagePlanTypeCode\": \"Room Only\",\r\n"
				+ "            \"inventoryTrackingId\": null,\r\n"
				+ "            \"totalPointsForRoomOnlyPackage\": 16,\r\n"
				+ "            \"totalCashForRoomOnlyPackage\": 0,\r\n"
				+ "            \"totalCashForAddOnPackage\": 0,\r\n" + "            \"totalFees\": 0,\r\n"
				+ "            \"roomOnlyPackageCode\": null,\r\n" + "            \"diningPackageCode\": null,\r\n"
				+ "            \"canCancelAccommodation\": true,\r\n"
				+ "            \"canModifyAccommodation\": true,\r\n" + "            \"canAddDine\": true,\r\n"
				+ "            \"isGuaranteedWeekAccommodation\": false,\r\n"
				+ "            \"bookDate\": \"2018-06-20T09:53:44.000-04:00\",\r\n"
				+ "            \"hasDateGapIfCancelled\": false,\r\n"
				+ "            \"specialNeedsRequested\": false\r\n" + "        }\r\n" + "    ],\r\n"
				+ "    \"confirmationReceivers\": [\r\n" + "        {\r\n" + "            \"guest\": {\r\n"
				+ "                \"guestOfMember\": false,\r\n" + "                \"primaryGuest\": false,\r\n"
				+ "                \"guestDetails\": {\r\n" + "                    \"firstName\": \"MODIFY GUEST\",\r\n"
				+ "                    \"lastName\": \"FIX TEST B\",\r\n"
				+ "                    \"middleName\": null,\r\n" + "                    \"ssn4Digits\": null,\r\n"
				+ "                    \"suffixes\": [],\r\n" + "                    \"titles\": [\r\n"
				+ "                        \"Mr.\"\r\n" + "                    ],\r\n"
				+ "                    \"languagePreference\": \"eng\",\r\n"
				+ "                    \"addresses\": [\r\n" + "                        {\r\n"
				+ "                            \"address1\": \"250 Celebration Pl\",\r\n"
				+ "                            \"address2\": null,\r\n"
				+ "                            \"address3\": null,\r\n"
				+ "                            \"city\": \"Celebration\",\r\n"
				+ "                            \"state\": \"FL\",\r\n"
				+ "                            \"postal\": \"34747\",\r\n"
				+ "                            \"country\": \"USA\",\r\n"
				+ "                            \"addressType\": \"UNKNOWN\",\r\n"
				+ "                            \"primary\": false\r\n" + "                        }\r\n"
				+ "                    ],\r\n" + "                    \"emailLists\": [\r\n"
				+ "                        {\r\n"
				+ "                            \"emailAddress\": \"dom6000053@autotest.com\",\r\n"
				+ "                            \"primary\": true\r\n" + "                        }\r\n"
				+ "                    ],\r\n" + "                    \"phoneLists\": [],\r\n"
				+ "                    \"guestIdReferences\": [\r\n" + "                        {\r\n"
				+ "                            \"guestIdType\": null,\r\n"
				+ "                            \"guestIdValue\": \"355770625\"\r\n" + "                        }\r\n"
				+ "                    ],\r\n" + "                    \"age\": 0,\r\n"
				+ "                    \"ageType\": null\r\n" + "                }\r\n" + "            },\r\n"
				+ "            \"byFax\": false,\r\n" + "            \"byEmail\": true,\r\n"
				+ "            \"byPrint\": false\r\n" + "        }\r\n" + "    ],\r\n" + "    \"creditCards\": [],\r\n"
				+ "    \"travelPlanId\": 481715334999,\r\n" + "    \"travelPlanSegmentId\": 481711556190,\r\n"
				+ "    \"cancellationNumber\": 593168,\r\n" + "    \"status\": \"CANCELLED\",\r\n"
				+ "    \"arrivalDateForEntireTrip\": null,\r\n" + "    \"departDateForEntireTrip\": null,\r\n"
				+ "    \"totalPointsForEntireTrip\": 0,\r\n" + "    \"totalCashForEntireTrip\": 0,\r\n"
				+ "    \"cashDue\": 0,\r\n" + "    \"canAddAccommodation\": false,\r\n" + "    \"linked\": false\r\n"
				+ "}";

		List<String> keys = Arrays.asList("emailAddress", "addressType", "address1", "address2", "city", "state",
				"phoneNumber", "postal", "country");
		for (String key : keys) {
			Pattern pattern = Pattern.compile("\"" + key + "\": \"(\\d+|[^\\\"]*)\"");
			Matcher matcher = pattern.matcher(jsonString);
			while (matcher.find()) {
				String group = matcher.group(1);
				jsonString = jsonString.replace(group, StringUtils.repeat('*', group.length()));
			}
		}

		System.out.println(jsonString);
	}
}
