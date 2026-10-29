package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p000.AbstractC0894m2;
import p000.AbstractC1356y5;
import p000.lk0;
import p000.oh6;
import p000.qo5;
import p000.z32;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class Status extends AbstractC0894m2 implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new qo5(12);

    /* JADX INFO: renamed from: d */
    public final int f16228d;

    /* JADX INFO: renamed from: e */
    public final String f16229e;

    /* JADX INFO: renamed from: f */
    public final PendingIntent f16230f;

    /* JADX INFO: renamed from: g */
    public final lk0 f16231g;

    public Status(int i, String str, PendingIntent pendingIntent, lk0 lk0Var) {
        this.f16228d = i;
        this.f16229e = str;
        this.f16230f = pendingIntent;
        this.f16231g = lk0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f16228d == status.f16228d && AbstractC1356y5.m12927u(this.f16229e, status.f16229e) && AbstractC1356y5.m12927u(this.f16230f, status.f16230f) && AbstractC1356y5.m12927u(this.f16231g, status.f16231g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16228d), this.f16229e, this.f16230f, this.f16231g});
    }

    public final String toString() {
        z32 z32VarM12903L = AbstractC1356y5.m12903L(this);
        String string = this.f16229e;
        if (string == null) {
            int i = this.f16228d;
            switch (i) {
                case -1:
                    string = "SUCCESS_CACHE";
                    break;
                case 0:
                    string = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
                    sb.append("unknown status code: ");
                    sb.append(i);
                    string = sb.toString();
                    break;
                case 2:
                    string = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    string = "SERVICE_DISABLED";
                    break;
                case 4:
                    string = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    string = "INVALID_ACCOUNT";
                    break;
                case 6:
                    string = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    string = "NETWORK_ERROR";
                    break;
                case 8:
                    string = "INTERNAL_ERROR";
                    break;
                case 10:
                    string = "DEVELOPER_ERROR";
                    break;
                case 13:
                    string = "ERROR";
                    break;
                case 14:
                    string = "INTERRUPTED";
                    break;
                case 15:
                    string = "TIMEOUT";
                    break;
                case 16:
                    string = "CANCELED";
                    break;
                case 17:
                    string = "API_NOT_CONNECTED";
                    break;
                case 18:
                    string = "DEAD_CLIENT";
                    break;
                case 19:
                    string = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    string = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    string = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    string = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        z32VarM12903L.m13323p(string, "statusCode");
        z32VarM12903L.m13323p(this.f16230f, "resolution");
        return z32VarM12903L.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9091P(parcel, 1, 4);
        parcel.writeInt(this.f16228d);
        oh6.m9088M(parcel, 2, this.f16229e);
        oh6.m9087L(parcel, 3, this.f16230f, i);
        oh6.m9087L(parcel, 4, this.f16231g, i);
        oh6.m9094S(parcel, iM9092Q);
    }
}
