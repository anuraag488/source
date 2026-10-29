package p000;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qg3 {

    /* JADX INFO: renamed from: a */
    public final String f28455a;

    /* JADX INFO: renamed from: b */
    public final String f28456b;

    /* JADX INFO: renamed from: c */
    public final String f28457c;

    public qg3(JSONObject jSONObject) {
        this.f28457c = jSONObject.optString("billingPeriod");
        this.f28456b = jSONObject.optString("priceCurrencyCode");
        this.f28455a = jSONObject.optString("formattedPrice");
        jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
