package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p000.AbstractC0894m2;
import p000.C1280w4;
import p000.np5;
import p000.oh6;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class LocationAvailability extends AbstractC0894m2 implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new C1280w4((byte) 27);

    /* JADX INFO: renamed from: d */
    public int f16232d;

    /* JADX INFO: renamed from: e */
    public int f16233e;

    /* JADX INFO: renamed from: f */
    public long f16234f;

    /* JADX INFO: renamed from: g */
    public int f16235g;

    /* JADX INFO: renamed from: h */
    public np5[] f16236h;

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f16232d == locationAvailability.f16232d && this.f16233e == locationAvailability.f16233e && this.f16234f == locationAvailability.f16234f && this.f16235g == locationAvailability.f16235g && Arrays.equals(this.f16236h, locationAvailability.f16236h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16235g)});
    }

    public final String toString() {
        boolean z = this.f16235g < 1000;
        StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 22);
        sb.append("LocationAvailability[");
        sb.append(z);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f16232d;
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9091P(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.f16233e;
        oh6.m9091P(parcel, 2, 4);
        parcel.writeInt(i3);
        long j = this.f16234f;
        oh6.m9091P(parcel, 3, 8);
        parcel.writeLong(j);
        int i4 = this.f16235g;
        oh6.m9091P(parcel, 4, 4);
        parcel.writeInt(i4);
        oh6.m9089N(parcel, 5, this.f16236h, i);
        int i5 = i4 >= 1000 ? 0 : 1;
        oh6.m9091P(parcel, 6, 4);
        parcel.writeInt(i5);
        oh6.m9094S(parcel, iM9092Q);
    }
}
