package p000;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class qv5 {

    /* JADX INFO: renamed from: a */
    public static final int f28836a = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: a */
    public static int m10133a(String str, Bundle bundle) {
        if (bundle == null) {
            m10140h(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            m10139g(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        m10140h(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    /* JADX INFO: renamed from: b */
    public static void m10134b(Bundle bundle, String str, long j) {
        bundle.putString("playBillingLibraryVersion", "9.1.0");
        if (str != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str);
        }
        bundle.putLong("billingClientSessionId", j);
    }

    /* JADX INFO: renamed from: c */
    public static Bundle m10135c(f00 f00Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", f00Var.f18622a);
        bundle.putString("DEBUG_MESSAGE", f00Var.f18624c);
        bundle.putInt("LOG_REASON", sk5.m10839e(i));
        return bundle;
    }

    /* JADX INFO: renamed from: d */
    public static Bundle m10136d(String str, ArrayList arrayList, dn5 dn5Var, long j) {
        Bundle bundle = new Bundle();
        m10134b(bundle, str, j);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        uu5 uu5Var = sv5.f30597b;
        Object[] objArr = {"subs", "inapp"};
        for (int i = 0; i < 2; i++) {
            if (objArr[i] == null) {
                xy4.m12782k(c75.m3877i(i, "at index "));
                return null;
            }
        }
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>(sv5.m10928m(2, objArr)));
        Object[] objArr2 = {"inapp"};
        for (int i2 = 0; i2 < 1; i2++) {
            if (objArr2[i2] == null) {
                xy4.m12782k(c75.m3877i(i2, "at index "));
                return null;
            }
        }
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_PREORDER_OFFERS", new ArrayList<>(sv5.m10928m(1, objArr2)));
        Object[] objArr3 = {"inapp"};
        for (int i3 = 0; i3 < 1; i3++) {
            if (objArr3[i3] == null) {
                xy4.m12782k(c75.m3877i(i3, "at index "));
                return null;
            }
        }
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>(sv5.m10928m(1, objArr3)));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        if (dn5Var.f17220a) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        int size = arrayList.size();
        boolean z = false;
        boolean z2 = false;
        for (int i4 = 0; i4 < size; i4++) {
            ui3 ui3Var = (ui3) arrayList.get(i4);
            arrayList2.add(null);
            z |= !TextUtils.isEmpty(null);
            ui3Var.getClass();
            arrayList4.add(null);
            z2 |= !TextUtils.isEmpty(null);
            if (ui3Var.f31894b.equals("first_party")) {
                xy4.m12782k("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                return null;
            }
        }
        if (z) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        if (z2) {
            bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: e */
    public static f00 m10137e(Intent intent, String str) {
        if (intent != null) {
            e00 e00VarM5438a = f00.m5438a();
            e00VarM5438a.f17552a = m10133a(str, intent.getExtras());
            e00VarM5438a.f17554c = m10138f(str, intent.getExtras());
            return e00VarM5438a.m4828e();
        }
        m10140h("BillingHelper", "Got null intent!");
        e00 e00VarM5438a2 = f00.m5438a();
        e00VarM5438a2.f17552a = 6;
        e00VarM5438a2.f17554c = "An internal error occurred.";
        return e00VarM5438a2.m4828e();
    }

    /* JADX INFO: renamed from: f */
    public static String m10138f(String str, Bundle bundle) {
        if (bundle == null) {
            m10140h(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            m10139g(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        m10140h(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    /* JADX INFO: renamed from: g */
    public static void m10139g(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i = 40000;
            while (!str2.isEmpty() && i > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i));
                Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i -= iMin;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m10140h(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m10141i(String str, String str2, Throwable th) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public static ji3 m10142j(String str, String str2, Set set) {
        ji3 ji3Var = null;
        if (str == null || str2 == null) {
            m10139g("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            ji3 ji3Var2 = new ji3(str, str2);
            try {
                set.isEmpty();
                return ji3Var2;
            } catch (JSONException e) {
                e = e;
                ji3Var = ji3Var2;
                m10140h("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
                return ji3Var;
            }
        } catch (JSONException e2) {
            e = e2;
        }
    }
}
