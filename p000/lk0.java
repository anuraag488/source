package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lk0 extends AbstractC0894m2 {

    /* JADX INFO: renamed from: d */
    public final int f24096d;

    /* JADX INFO: renamed from: e */
    public final int f24097e;

    /* JADX INFO: renamed from: f */
    public final PendingIntent f24098f;

    /* JADX INFO: renamed from: g */
    public final String f24099g;

    /* JADX INFO: renamed from: h */
    public final Integer f24100h;

    /* JADX INFO: renamed from: i */
    public static final lk0 f24095i = new lk0(0, null, null);
    public static final Parcelable.Creator<lk0> CREATOR = new C1280w4(26);

    public lk0(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.f24096d = i;
        this.f24097e = i2;
        this.f24098f = pendingIntent;
        this.f24099g = str;
        this.f24100h = num;
    }

    /* JADX INFO: renamed from: b */
    public static String m7994b(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lk0)) {
            return false;
        }
        lk0 lk0Var = (lk0) obj;
        return this.f24097e == lk0Var.f24097e && AbstractC1356y5.m12927u(this.f24098f, lk0Var.f24098f) && AbstractC1356y5.m12927u(this.f24099g, lk0Var.f24099g) && AbstractC1356y5.m12927u(this.f24100h, lk0Var.f24100h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f24097e), this.f24098f, this.f24099g, this.f24100h});
    }

    public final String toString() {
        z32 z32VarM12903L = AbstractC1356y5.m12903L(this);
        z32VarM12903L.m13323p(m7994b(this.f24097e), "statusCode");
        z32VarM12903L.m13323p(this.f24098f, "resolution");
        z32VarM12903L.m13323p(this.f24099g, "message");
        z32VarM12903L.m13323p(this.f24100h, "clientMethodKey");
        return z32VarM12903L.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9091P(parcel, 1, 4);
        parcel.writeInt(this.f24096d);
        oh6.m9091P(parcel, 2, 4);
        parcel.writeInt(this.f24097e);
        oh6.m9087L(parcel, 3, this.f24098f, i);
        oh6.m9088M(parcel, 4, this.f24099g);
        Integer num = this.f24100h;
        if (num != null) {
            oh6.m9091P(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        oh6.m9094S(parcel, iM9092Q);
    }

    public lk0(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
