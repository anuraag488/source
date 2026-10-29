package p000;

import android.text.TextUtils;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sg3 {

    /* JADX INFO: renamed from: a */
    public final String f30242a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f30243b;

    /* JADX INFO: renamed from: c */
    public final String f30244c;

    /* JADX INFO: renamed from: d */
    public final String f30245d;

    /* JADX INFO: renamed from: e */
    public final String f30246e;

    /* JADX INFO: renamed from: f */
    public final String f30247f;

    /* JADX INFO: renamed from: g */
    public final String f30248g;

    /* JADX INFO: renamed from: h */
    public final String f30249h;

    /* JADX INFO: renamed from: i */
    public final String f30250i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f30251j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f30252k;

    public sg3(String str) throws JSONException {
        this.f30242a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f30243b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f30244c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f30245d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            C1077qn.m9987m("Product id cannot be empty.");
            throw null;
        }
        if (TextUtils.isEmpty(strOptString2)) {
            C1077qn.m9987m("Product type cannot be empty.");
            throw null;
        }
        this.f30246e = jSONObject.optString("title");
        this.f30247f = jSONObject.optString("name");
        this.f30248g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f30249h = jSONObject.optString("skuDetailsToken");
        this.f30250i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                rg3 rg3Var = new rg3();
                jSONObject2.optString("basePlanId");
                jSONObject2.optString("offerId").getClass();
                rg3Var.f29259a = jSONObject2.getString("offerIdToken");
                JSONArray jSONArray = jSONObject2.getJSONArray("pricingPhases");
                cu2 cu2Var = new cu2();
                ArrayList arrayList2 = new ArrayList();
                if (jSONArray != null) {
                    int i2 = 0;
                    while (i2 < jSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                        JSONArray jSONArray2 = jSONArrayOptJSONArray;
                        if (jSONObjectOptJSONObject != null) {
                            arrayList2.add(new qg3(jSONObjectOptJSONObject));
                        }
                        i2++;
                        jSONArrayOptJSONArray = jSONArray2;
                    }
                }
                JSONArray jSONArray3 = jSONArrayOptJSONArray;
                cu2Var.f16495a = arrayList2;
                VarHandle.storeStoreFence();
                rg3Var.f29260b = cu2Var;
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("installmentPlanDetails");
                if (jSONObjectOptJSONObject2 != null) {
                    jSONObjectOptJSONObject2.getInt("commitmentPaymentsCount");
                    jSONObjectOptJSONObject2.optInt("subsequentCommitmentPaymentsCount");
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("transitionPlanDetails");
                if (jSONObjectOptJSONObject3 != null) {
                    jSONObjectOptJSONObject3.getString("productId");
                    jSONObjectOptJSONObject3.optString("title");
                    jSONObjectOptJSONObject3.optString("name");
                    jSONObjectOptJSONObject3.optString("description");
                    jSONObjectOptJSONObject3.optString("basePlanId");
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("pricingPhase");
                    if (jSONObjectOptJSONObject4 != null) {
                        jSONObjectOptJSONObject4.optString("billingPeriod");
                        jSONObjectOptJSONObject4.optString("priceCurrencyCode");
                        jSONObjectOptJSONObject4.optString("formattedPrice");
                        jSONObjectOptJSONObject4.optLong("priceAmountMicros");
                        jSONObjectOptJSONObject4.optInt("recurrenceMode");
                        jSONObjectOptJSONObject4.optInt("billingCycleCount");
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("offerTags");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                        arrayList3.add(jSONArrayOptJSONArray2.getString(i3));
                    }
                }
                VarHandle.storeStoreFence();
                arrayList.add(rg3Var);
                i++;
                jSONArrayOptJSONArray = jSONArray3;
            }
            this.f30251j = arrayList;
        } else {
            this.f30251j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject5 = this.f30243b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray3 = this.f30243b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList4 = new ArrayList();
        if (jSONArrayOptJSONArray3 != null) {
            for (int i4 = 0; i4 < jSONArrayOptJSONArray3.length(); i4++) {
                arrayList4.add(new pg3(jSONArrayOptJSONArray3.getJSONObject(i4)));
            }
            this.f30252k = arrayList4;
            return;
        }
        if (jSONObjectOptJSONObject5 == null) {
            this.f30252k = null;
        } else {
            arrayList4.add(new pg3(jSONObjectOptJSONObject5));
            this.f30252k = arrayList4;
        }
    }

    /* JADX INFO: renamed from: a */
    public final pg3 m10748a() {
        ArrayList arrayList = this.f30252k;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (pg3) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sg3) {
            return TextUtils.equals(this.f30242a, ((sg3) obj).f30242a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30242a.hashCode();
    }

    public final String toString() {
        String string = this.f30243b.toString();
        String strValueOf = String.valueOf(this.f30251j);
        StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
        zi4.m13599B(sb, this.f30242a, "', parsedJson=", string, ", productId='");
        sb.append(this.f30244c);
        sb.append("', productType='");
        sb.append(this.f30245d);
        sb.append("', title='");
        sb.append(this.f30246e);
        sb.append("', productDetailsToken='");
        return c75.m3882n(sb, this.f30249h, "', subscriptionOfferDetails=", strValueOf, "}");
    }
}
