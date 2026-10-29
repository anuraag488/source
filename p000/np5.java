package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class np5 extends AbstractC0894m2 {
    public static final Parcelable.Creator<np5> CREATOR = new qo5(3);

    /* JADX INFO: renamed from: d */
    public int f26021d;

    /* JADX INFO: renamed from: e */
    public int f26022e;

    /* JADX INFO: renamed from: f */
    public long f26023f;

    /* JADX INFO: renamed from: g */
    public long f26024g;

    public final boolean equals(Object obj) {
        if (obj instanceof np5) {
            np5 np5Var = (np5) obj;
            if (this.f26021d == np5Var.f26021d && this.f26022e == np5Var.f26022e && this.f26023f == np5Var.f26023f && this.f26024g == np5Var.f26024g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f26022e), Integer.valueOf(this.f26021d), Long.valueOf(this.f26024g), Long.valueOf(this.f26023f)});
    }

    public final String toString() {
        int i = this.f26021d;
        int length = String.valueOf(i).length();
        int i2 = this.f26022e;
        int length2 = String.valueOf(i2).length();
        long j = this.f26024g;
        int length3 = String.valueOf(j).length();
        long j2 = this.f26023f;
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j2).length());
        sb.append("NetworkLocationStatus: Wifi status: ");
        sb.append(i);
        sb.append(" Cell status: ");
        sb.append(i2);
        sb.append(" elapsed time NS: ");
        sb.append(j);
        sb.append(" system time ms: ");
        sb.append(j2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f26021d;
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9091P(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.f26022e;
        oh6.m9091P(parcel, 2, 4);
        parcel.writeInt(i3);
        long j = this.f26023f;
        oh6.m9091P(parcel, 3, 8);
        parcel.writeLong(j);
        long j2 = this.f26024g;
        oh6.m9091P(parcel, 4, 8);
        parcel.writeLong(j2);
        oh6.m9094S(parcel, iM9092Q);
    }
}
