package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p000.AbstractC0894m2;
import p000.oh6;
import p000.qo5;
import p000.y42;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class Scope extends AbstractC0894m2 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new qo5(8);

    /* JADX INFO: renamed from: d */
    public final int f16226d;

    /* JADX INFO: renamed from: e */
    public final String f16227e;

    public Scope(int i, String str) {
        y42.m12852Y(str, "scopeUri must not be null or empty");
        this.f16226d = i;
        this.f16227e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f16227e.equals(((Scope) obj).f16227e);
    }

    public final int hashCode() {
        return this.f16227e.hashCode();
    }

    public final String toString() {
        return this.f16227e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9091P(parcel, 1, 4);
        parcel.writeInt(this.f16226d);
        oh6.m9088M(parcel, 2, this.f16227e);
        oh6.m9094S(parcel, iM9092Q);
    }
}
