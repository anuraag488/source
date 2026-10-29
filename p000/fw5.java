package p000;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fw5 extends mh5 {

    /* JADX INFO: renamed from: j */
    public final zu5 f19358j;

    /* JADX INFO: renamed from: k */
    public final Boolean f19359k;

    /* JADX INFO: renamed from: l */
    public final int f19360l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C0927mz f19361m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw5(C0927mz c0927mz, zu5 zu5Var, Boolean bool, int i) {
        super("com.android.vending.billing.IInAppBillingInitializeCallback", (byte) 2);
        Objects.requireNonNull(c0927mz);
        this.f19361m = c0927mz;
        this.f19358j = zu5Var;
        this.f19359k = bool;
        this.f19360l = i;
    }

    @Override // p000.mh5
    /* JADX INFO: renamed from: E */
    public final boolean mo5422E(Parcel parcel, int i) {
        bw5 hx5Var;
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) dr5.m4663a(parcel);
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(c75.m3877i(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        if (bundle == null) {
            qv5.m10140h("BillingClient", "Response bundle is null.");
            m5840I(this.f19358j, rz5.f29765h, 122, this.f19359k.booleanValue(), null, this.f19360l);
            return true;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            qv5.m10140h("BillingClient", "Response bundle doesn't contain a response code");
            m5840I(this.f19358j, rz5.f29765h, 129, this.f19359k.booleanValue(), null, this.f19360l);
            return true;
        }
        if (bundle.getInt("RESPONSE_CODE") != 0) {
            m5840I(this.f19358j, rz5.m10511a(bundle.getInt("RESPONSE_CODE"), bundle.getString("DEBUG_MESSAGE", "")), 130, this.f19359k.booleanValue(), c75.m3877i(bundle.getInt("RESPONSE_CODE"), "Response code from Phonesky: "), this.f19360l);
            return true;
        }
        if (!bundle.containsKey("BILLING_API_VERSION_KEY")) {
            qv5.m10140h("BillingClient", "Billing API version not found in response bundle.");
            m5840I(this.f19358j, rz5.f29765h, 128, this.f19359k.booleanValue(), null, this.f19360l);
            return true;
        }
        int i2 = bundle.getInt("BILLING_API_VERSION_KEY");
        C0927mz c0927mz = this.f19361m;
        C0927mz.m8429q(c0927mz, i2);
        c0927mz.f25323k = i2 >= 3;
        Bundle bundle2 = bundle.getBundle("EXPERIMENT_VALUES_KEY");
        if (bundle2 != null) {
            try {
                bundle2.getBoolean("DELEGATION_API_ENABLED_KEY");
            } catch (Throwable th) {
                qv5.m10141i("BillingClient", "Error reading EnableDelegationApi experiment flag: ".concat(bundle2.toString()), th);
            }
            try {
                g06.f19477a = bundle2.getLong("AUTO_SERVICE_RECONNECTION_SYNCHRONOUS_TIMEOUT_MS_KEY");
            } catch (Throwable th2) {
                qv5.m10141i("BillingClient", "Error reading AutoServiceReconnectionSynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th2);
            }
            try {
                g06.f19478b = bundle2.getLong("AUTO_SERVICE_RECONNECTION_ASYNCHRONOUS_TIMEOUT_MS_KEY");
            } catch (Throwable th3) {
                qv5.m10141i("BillingClient", "Error reading AutoServiceReconnectionAsynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th3);
            }
            try {
                g06.f19479c = bundle2.getInt("AUTO_SERVICE_RECONNECTION_MAX_NUM_RETRIES_KEY");
            } catch (Throwable th4) {
                qv5.m10141i("BillingClient", "Error reading AutoServiceReconnectionMaxNumRetries experiment flag: ".concat(bundle2.toString()), th4);
            }
            try {
                g06.f19480d = bundle2.getBoolean("ENABLE_DEDUPLICATE_SERVICE_DISCONNECTED_CALLBACK");
            } catch (Throwable th5) {
                qv5.m10141i("BillingClient", "Error reading EnableDeduplicateServiceDisconnectedCallback experiment flag: ".concat(bundle2.toString()), th5);
            }
        }
        Bundle bundle3 = bundle.getBundle("ENABLED_SUBSCRIPTION_CLIENT_ACTIONS_KEY");
        if (bundle3 != null) {
            Object[] objArrCopyOf = new Object[4];
            int i3 = 0;
            for (z26 z26Var : z26.values()) {
                if (bundle3.getBoolean(z26Var.name(), false)) {
                    int length = objArrCopyOf.length;
                    int i4 = i3 + 1;
                    int iM10125a = qu5.m10125a(length, i4);
                    if (iM10125a > length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM10125a);
                    }
                    objArrCopyOf[i3] = z26Var;
                    i3 = i4;
                }
            }
            C0927mz c0927mz2 = this.f19361m;
            if (i3 == 0) {
                hx5Var = cx5.f16587j;
            } else if (i3 != 1) {
                hx5Var = bw5.m3750q(i3, objArrCopyOf);
                hx5Var.size();
            } else {
                Object obj = objArrCopyOf[0];
                Objects.requireNonNull(obj);
                hx5Var = new hx5(obj);
            }
            c0927mz2.f25308A = hx5Var;
            if (c0927mz2.f25318f != null) {
                c0927mz2.f25318f.f36330g = c0927mz2.f25308A;
            }
        }
        C0927mz c0927mz3 = this.f19361m;
        if (c0927mz3.f25324l < 3) {
            qv5.m10140h("BillingClient", "In-app billing API version 3 is not supported on this device.");
            m5840I(this.f19358j, rz5.f29759b, 36, this.f19359k.booleanValue(), null, this.f19360l);
        } else {
            zu5 zu5Var = this.f19358j;
            Boolean bool = this.f19359k;
            int i5 = this.f19360l;
            boolean zBooleanValue = bool.booleanValue();
            C0927mz.m8430r(c0927mz3, 0);
            synchronized (c0927mz3.f25313a) {
                try {
                    if (c0927mz3.f25314b != 3) {
                        zu5Var.m13798c(i5, zBooleanValue);
                        zu5Var.m13799d(rz5.f29766i);
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: I */
    public final void m5840I(zu5 zu5Var, f00 f00Var, int i, boolean z, String str, int i2) {
        this.f19361m.m8435D(0);
        zu5Var.m13797b(f00Var, i, str, z, i2);
        zu5Var.m13799d(f00Var);
    }
}
