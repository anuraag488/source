package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cs0 extends AbstractC0894m2 {
    public static final Parcelable.Creator<cs0> CREATOR = new qo5((byte) 17);

    /* JADX INFO: renamed from: d */
    public final long f16416d;

    /* JADX INFO: renamed from: e */
    public final int f16417e;

    /* JADX INFO: renamed from: f */
    public final int f16418f;

    /* JADX INFO: renamed from: g */
    public final long f16419g;

    /* JADX INFO: renamed from: h */
    public final boolean f16420h;

    /* JADX INFO: renamed from: i */
    public final int f16421i;

    /* JADX INFO: renamed from: j */
    public final WorkSource f16422j;

    /* JADX INFO: renamed from: k */
    public final d16 f16423k;

    public cs0(long j, int i, int i2, long j2, boolean z, int i3, WorkSource workSource, d16 d16Var) {
        this.f16416d = j;
        this.f16417e = i;
        this.f16418f = i2;
        this.f16419g = j2;
        this.f16420h = z;
        this.f16421i = i3;
        this.f16422j = workSource;
        this.f16423k = d16Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cs0)) {
            return false;
        }
        cs0 cs0Var = (cs0) obj;
        return this.f16416d == cs0Var.f16416d && this.f16417e == cs0Var.f16417e && this.f16418f == cs0Var.f16418f && this.f16419g == cs0Var.f16419g && this.f16420h == cs0Var.f16420h && this.f16421i == cs0Var.f16421i && AbstractC1356y5.m12927u(this.f16422j, cs0Var.f16422j) && AbstractC1356y5.m12927u(this.f16423k, cs0Var.f16423k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f16416d), Integer.valueOf(this.f16417e), Integer.valueOf(this.f16418f), Long.valueOf(this.f16419g)});
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("CurrentLocationRequest[");
        sb.append(d46.m4343d(this.f16418f));
        long j = this.f16416d;
        if (j != Long.MAX_VALUE) {
            sb.append(", maxAge=");
            d26.m4326a(j, sb);
        }
        long j2 = this.f16419g;
        if (j2 != Long.MAX_VALUE) {
            sb.append(", duration=");
            sb.append(j2);
            sb.append("ms");
        }
        int i = this.f16417e;
        if (i != 0) {
            sb.append(", ");
            if (i == 0) {
                str2 = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i == 1) {
                str2 = "GRANULARITY_COARSE";
            } else {
                if (i != 2) {
                    ds3.m4665g();
                    return null;
                }
                str2 = "GRANULARITY_FINE";
            }
            sb.append(str2);
        }
        if (this.f16420h) {
            sb.append(", bypass");
        }
        int i2 = this.f16421i;
        if (i2 != 0) {
            sb.append(", ");
            if (i2 == 0) {
                str = "THROTTLE_BACKGROUND";
            } else if (i2 == 1) {
                str = "THROTTLE_ALWAYS";
            } else {
                if (i2 != 2) {
                    ds3.m4665g();
                    return null;
                }
                str = "THROTTLE_NEVER";
            }
            sb.append(str);
        }
        WorkSource workSource = this.f16422j;
        if (!p25.m9358a(workSource)) {
            sb.append(", workSource=");
            sb.append(workSource);
        }
        d16 d16Var = this.f16423k;
        if (d16Var != null) {
            sb.append(", impersonation=");
            sb.append(d16Var);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9091P(parcel, 1, 8);
        parcel.writeLong(this.f16416d);
        oh6.m9091P(parcel, 2, 4);
        parcel.writeInt(this.f16417e);
        oh6.m9091P(parcel, 3, 4);
        parcel.writeInt(this.f16418f);
        oh6.m9091P(parcel, 4, 8);
        parcel.writeLong(this.f16419g);
        oh6.m9091P(parcel, 5, 4);
        parcel.writeInt(this.f16420h ? 1 : 0);
        oh6.m9087L(parcel, 6, this.f16422j, i);
        oh6.m9091P(parcel, 7, 4);
        parcel.writeInt(this.f16421i);
        oh6.m9087L(parcel, 9, this.f16423k, i);
        oh6.m9094S(parcel, iM9092Q);
    }
}
