package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p000.AbstractC0894m2;
import p000.AbstractC1356y5;
import p000.C1280w4;
import p000.d16;
import p000.d26;
import p000.d46;
import p000.ds3;
import p000.oh6;
import p000.p25;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class LocationRequest extends AbstractC0894m2 implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new C1280w4((byte) 28);

    /* JADX INFO: renamed from: d */
    public final int f16237d;

    /* JADX INFO: renamed from: e */
    public final long f16238e;

    /* JADX INFO: renamed from: f */
    public final long f16239f;

    /* JADX INFO: renamed from: g */
    public final long f16240g;

    /* JADX INFO: renamed from: h */
    public final long f16241h;

    /* JADX INFO: renamed from: i */
    public final int f16242i;

    /* JADX INFO: renamed from: j */
    public final float f16243j;

    /* JADX INFO: renamed from: k */
    public final boolean f16244k;

    /* JADX INFO: renamed from: l */
    public final long f16245l;

    /* JADX INFO: renamed from: m */
    public final int f16246m;

    /* JADX INFO: renamed from: n */
    public final int f16247n;

    /* JADX INFO: renamed from: o */
    public final boolean f16248o;

    /* JADX INFO: renamed from: p */
    public final WorkSource f16249p;

    /* JADX INFO: renamed from: q */
    public final d16 f16250q;

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, boolean z2, WorkSource workSource, d16 d16Var) {
        this.f16237d = i;
        if (i == 105) {
            this.f16238e = Long.MAX_VALUE;
        } else {
            this.f16238e = j;
        }
        this.f16239f = j2;
        this.f16240g = j3;
        this.f16241h = j4 == Long.MAX_VALUE ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.f16242i = i2;
        this.f16243j = f;
        this.f16244k = z;
        this.f16245l = j6 != -1 ? j6 : j;
        this.f16246m = i3;
        this.f16247n = i4;
        this.f16248o = z2;
        this.f16249p = workSource;
        this.f16250q = d16Var;
    }

    /* JADX INFO: renamed from: c */
    public static String m4061c(long j) {
        String string;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb = d26.f16752b;
        synchronized (sb) {
            sb.setLength(0);
            d26.m4326a(j, sb);
            string = sb.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4062b() {
        long j = this.f16240g;
        return j > 0 && (j >> 1) >= this.f16238e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        int i = locationRequest.f16237d;
        int i2 = this.f16237d;
        if (i2 != i) {
            return false;
        }
        if ((i2 == 105 || this.f16238e == locationRequest.f16238e) && this.f16239f == locationRequest.f16239f && m4062b() == locationRequest.m4062b()) {
            return (!m4062b() || this.f16240g == locationRequest.f16240g) && this.f16241h == locationRequest.f16241h && this.f16242i == locationRequest.f16242i && this.f16243j == locationRequest.f16243j && this.f16244k == locationRequest.f16244k && this.f16246m == locationRequest.f16246m && this.f16247n == locationRequest.f16247n && this.f16248o == locationRequest.f16248o && this.f16249p.equals(locationRequest.f16249p) && AbstractC1356y5.m12927u(this.f16250q, locationRequest.f16250q);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16237d), Long.valueOf(this.f16238e), Long.valueOf(this.f16239f), this.f16249p});
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i = this.f16237d;
        long j = this.f16238e;
        long j2 = this.f16240g;
        if (i == 105) {
            sb.append(d46.m4343d(i));
            if (j2 > 0) {
                sb.append("/");
                d26.m4326a(j2, sb);
            }
        } else {
            sb.append("@");
            if (m4062b()) {
                d26.m4326a(j, sb);
                sb.append("/");
                d26.m4326a(j2, sb);
            } else {
                d26.m4326a(j, sb);
            }
            sb.append(" ");
            sb.append(d46.m4343d(i));
        }
        long j3 = this.f16239f;
        if (i == 105 || j3 != j) {
            sb.append(", minUpdateInterval=");
            sb.append(m4061c(j3));
        }
        float f = this.f16243j;
        if (f > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(f);
        }
        long j4 = this.f16245l;
        if (i != 105 ? j4 != j : j4 != Long.MAX_VALUE) {
            sb.append(", maxUpdateAge=");
            sb.append(m4061c(j4));
        }
        long j5 = this.f16241h;
        if (j5 != Long.MAX_VALUE) {
            sb.append(", duration=");
            d26.m4326a(j5, sb);
        }
        int i2 = this.f16242i;
        if (i2 != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(i2);
        }
        int i3 = this.f16247n;
        if (i3 != 0) {
            sb.append(", ");
            if (i3 == 0) {
                str2 = "THROTTLE_BACKGROUND";
            } else if (i3 == 1) {
                str2 = "THROTTLE_ALWAYS";
            } else {
                if (i3 != 2) {
                    ds3.m4665g();
                    return null;
                }
                str2 = "THROTTLE_NEVER";
            }
            sb.append(str2);
        }
        int i4 = this.f16246m;
        if (i4 != 0) {
            sb.append(", ");
            if (i4 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i4 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i4 != 2) {
                    ds3.m4665g();
                    return null;
                }
                str = "GRANULARITY_FINE";
            }
            sb.append(str);
        }
        if (this.f16244k) {
            sb.append(", waitForAccurateLocation");
        }
        if (this.f16248o) {
            sb.append(", bypass");
        }
        WorkSource workSource = this.f16249p;
        if (!p25.m9358a(workSource)) {
            sb.append(", ");
            sb.append(workSource);
        }
        d16 d16Var = this.f16250q;
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
        oh6.m9091P(parcel, 1, 4);
        parcel.writeInt(this.f16237d);
        oh6.m9091P(parcel, 2, 8);
        parcel.writeLong(this.f16238e);
        oh6.m9091P(parcel, 3, 8);
        parcel.writeLong(this.f16239f);
        oh6.m9091P(parcel, 6, 4);
        parcel.writeInt(this.f16242i);
        oh6.m9091P(parcel, 7, 4);
        parcel.writeFloat(this.f16243j);
        oh6.m9091P(parcel, 8, 8);
        parcel.writeLong(this.f16240g);
        oh6.m9091P(parcel, 9, 4);
        parcel.writeInt(this.f16244k ? 1 : 0);
        oh6.m9091P(parcel, 10, 8);
        parcel.writeLong(this.f16241h);
        oh6.m9091P(parcel, 11, 8);
        parcel.writeLong(this.f16245l);
        oh6.m9091P(parcel, 12, 4);
        parcel.writeInt(this.f16246m);
        oh6.m9091P(parcel, 13, 4);
        parcel.writeInt(this.f16247n);
        oh6.m9091P(parcel, 15, 4);
        parcel.writeInt(this.f16248o ? 1 : 0);
        oh6.m9087L(parcel, 16, this.f16249p, i);
        oh6.m9087L(parcel, 17, this.f16250q, i);
        oh6.m9094S(parcel, iM9092Q);
    }
}
