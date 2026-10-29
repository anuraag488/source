package p000;

import android.os.Parcel;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ch1 implements bp6 {

    /* JADX INFO: renamed from: a */
    public byte f16015a;

    /* JADX INFO: renamed from: b */
    public Object f16016b;

    /* JADX WARN: Multi-variable type inference failed */
    public ch1(String str, int i) {
        this.f16016b = str;
        this.f16015a = i;
    }

    @Override // p000.bp6
    /* JADX INFO: renamed from: b */
    public String mo3660b(dm6 dm6Var) {
        String str;
        ez5 ez5Var = (ez5) this.f16016b;
        byte b = this.f16015a;
        try {
            if (ez5Var.f18617H == null) {
                throw null;
            }
            xr5 xr5Var = ez5Var.f18617H;
            String packageName = ez5Var.f18615F.getPackageName();
            if (b == 2) {
                str = "LAUNCH_BILLING_FLOW";
            } else if (b == 3) {
                str = "ACKNOWLEDGE_PURCHASE";
            } else if (b == 4) {
                str = "CONSUME_ASYNC";
            } else if (b != 5) {
                str = b != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION";
            } else {
                str = "IS_FEATURE_SUPPORTED";
            }
            ey5 ey5Var = new ey5("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback", (byte) 2);
            ey5Var.f18585j = dm6Var;
            VarHandle.storeStoreFence();
            hr5 hr5Var = (hr5) xr5Var;
            Parcel parcelM7555L = hr5Var.m7555L();
            parcelM7555L.writeString(packageName);
            parcelM7555L.writeString(str);
            int i = dr5.f17310a;
            parcelM7555L.writeStrongBinder(ey5Var);
            try {
                hr5Var.f23220b.transact(1, parcelM7555L, null, 1);
                return "billingOverrideService.getBillingOverride";
            } finally {
                parcelM7555L.recycle();
            }
        } catch (Exception e) {
            ez5Var.m5428O(95, 28, rz5.f29776s);
            qv5.m10141i("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            dm6Var.m4562a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }
}
