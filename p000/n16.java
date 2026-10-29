package p000;

import ads_mobile_sdk.C0313rh;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.location.LocationRequest;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n16 extends AbstractC0894m2 {
    public static final Parcelable.Creator<n16> CREATOR = new qo5((byte) 14);

    /* JADX INFO: renamed from: d */
    public final LocationRequest f25391d;

    /* JADX WARN: Code duplicated, block: B:100:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:102:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x00da  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:55:0x0102  */
    /* JADX WARN: Code duplicated, block: B:57:0x0108  */
    /* JADX WARN: Code duplicated, block: B:58:0x010a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:63:0x012c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0158  */
    /* JADX WARN: Code duplicated, block: B:78:0x015c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0160  */
    /* JADX WARN: Code duplicated, block: B:82:0x0164  */
    /* JADX WARN: Code duplicated, block: B:85:0x016a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0179  */
    /* JADX WARN: Code duplicated, block: B:89:0x017c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0183  */
    /* JADX WARN: Code duplicated, block: B:95:0x019e  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d6  */
    public n16(LocationRequest locationRequest, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        int i;
        boolean z5;
        Object[] objArr;
        int i2;
        int i3;
        boolean z6;
        Object[] objArr2;
        d16 d16Var;
        boolean z7;
        int i4;
        long j2;
        long j3;
        long jMin;
        WorkSource workSource;
        int size;
        int i5;
        int i6;
        String str;
        Method method;
        Method method2;
        int i7 = locationRequest.f16237d;
        long j4 = locationRequest.f16238e;
        cn2 cn2Var = new cn2();
        cn2Var.f16142a = C0313rh.f10758U0;
        cn2Var.f16144c = -1L;
        cn2Var.f16145d = 0L;
        cn2Var.f16146e = Long.MAX_VALUE;
        cn2Var.f16147f = Integer.MAX_VALUE;
        cn2Var.f16148g = 0.0f;
        cn2Var.f16149h = true;
        cn2Var.f16150i = -1L;
        cn2Var.f16151j = 0;
        cn2Var.f16152k = 0;
        cn2Var.f16153l = false;
        cn2Var.f16154m = null;
        cn2Var.f16155n = null;
        y42.m12848U("intervalMillis must be greater than or equal to 0", j4 >= 0);
        cn2Var.f16143b = j4;
        d46.m4341b(i7);
        cn2Var.f16142a = i7;
        VarHandle.storeStoreFence();
        long j5 = locationRequest.f16239f;
        y42.m12848U("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", j5 == -1 || j5 >= 0);
        cn2Var.f16144c = j5;
        long j6 = locationRequest.f16240g;
        y42.m12848U("maxUpdateDelayMillis must be greater than or equal to 0", j6 >= 0);
        cn2Var.f16145d = j6;
        long j7 = locationRequest.f16241h;
        y42.m12848U("durationMillis must be greater than 0", j7 > 0);
        cn2Var.f16146e = j7;
        int i8 = locationRequest.f16242i;
        y42.m12848U("maxUpdates must be greater than 0", i8 > 0);
        cn2Var.f16147f = i8;
        float f = locationRequest.f16243j;
        y42.m12848U("minUpdateDistanceMeters must be greater than or equal to 0", f >= 0.0f);
        cn2Var.f16148g = f;
        cn2Var.f16149h = locationRequest.f16244k;
        cn2Var.m4051a(locationRequest.f16245l);
        int i9 = locationRequest.f16246m;
        if (i9 != 0 && i9 != 1) {
            if (i9 == 2) {
                i = 2;
            } else {
                i = i9;
                z5 = false;
            }
            objArr = new Object[]{Integer.valueOf(i)};
            if (z5) {
                throw new IllegalArgumentException(String.format("granularity %d must be a Granularity.GRANULARITY_* constant", objArr));
            }
            cn2Var.f16151j = i9;
            i2 = locationRequest.f16247n;
            if (i2 == 0 && i2 != 1) {
                if (i2 == 2) {
                    i3 = 2;
                } else {
                    i3 = i2;
                    z6 = false;
                }
                objArr2 = new Object[]{Integer.valueOf(i3)};
                if (!z6) {
                    throw new IllegalArgumentException(String.format("throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", objArr2));
                }
                cn2Var.f16152k = i2;
                cn2Var.f16153l = locationRequest.f16248o;
                cn2Var.f16154m = locationRequest.f16249p;
                d16Var = locationRequest.f16250q;
                if (d16Var != null || d16Var.f16737i == null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                y42.m12849V(z7);
                cn2Var.f16155n = d16Var;
                if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        workSource = null;
                    } else {
                        workSource = new WorkSource();
                        size = arrayList.size();
                        i5 = 0;
                        while (i5 < size) {
                            Object obj = arrayList.get(i5);
                            i5++;
                            ba0 ba0Var = (ba0) obj;
                            i6 = ba0Var.f15186d;
                            str = ba0Var.f15187e;
                            method = p25.f27328b;
                            if (method != null) {
                                try {
                                    method.invoke(workSource, Integer.valueOf(i6), str == null ? "" : str);
                                } catch (Exception e) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                                }
                            } else {
                                method2 = p25.f27327a;
                                if (method2 != null) {
                                    try {
                                        method2.invoke(workSource, Integer.valueOf(i6));
                                    } catch (Exception e2) {
                                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                                    }
                                }
                            }
                        }
                    }
                    cn2Var.f16154m = workSource;
                }
                if (z) {
                    cn2Var.f16151j = 1;
                }
                if (z2) {
                    cn2Var.f16152k = 2;
                }
                if (z3) {
                    cn2Var.f16153l = true;
                }
                if (z4) {
                    cn2Var.f16149h = true;
                }
                if (j != Long.MAX_VALUE) {
                    cn2Var.m4051a(j);
                }
                i4 = cn2Var.f16142a;
                j2 = cn2Var.f16143b;
                j3 = cn2Var.f16144c;
                if (j3 == -1) {
                    jMin = j2;
                } else {
                    jMin = i4 != 105 ? Math.min(j3, j2) : j3;
                }
                long jMax = Math.max(cn2Var.f16145d, cn2Var.f16143b);
                long j8 = cn2Var.f16146e;
                int i10 = cn2Var.f16147f;
                float f2 = cn2Var.f16148g;
                boolean z8 = cn2Var.f16149h;
                long j9 = cn2Var.f16150i;
                this.f25391d = new LocationRequest(i4, j2, jMin, jMax, Long.MAX_VALUE, j8, i10, f2, z8, j9 == -1 ? cn2Var.f16143b : j9, cn2Var.f16151j, cn2Var.f16152k, cn2Var.f16153l, new WorkSource(cn2Var.f16154m), cn2Var.f16155n);
            }
            i3 = i2;
            z6 = true;
            objArr2 = new Object[]{Integer.valueOf(i3)};
            if (!z6) {
                throw new IllegalArgumentException(String.format("throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", objArr2));
            }
            cn2Var.f16152k = i2;
            cn2Var.f16153l = locationRequest.f16248o;
            cn2Var.f16154m = locationRequest.f16249p;
            d16Var = locationRequest.f16250q;
            if (d16Var != null) {
                z7 = true;
            } else {
                z7 = true;
            }
            y42.m12849V(z7);
            cn2Var.f16155n = d16Var;
            if (arrayList != null) {
                if (arrayList.isEmpty()) {
                    workSource = null;
                } else {
                    workSource = new WorkSource();
                    size = arrayList.size();
                    i5 = 0;
                    while (i5 < size) {
                        Object obj2 = arrayList.get(i5);
                        i5++;
                        ba0 ba0Var2 = (ba0) obj2;
                        i6 = ba0Var2.f15186d;
                        str = ba0Var2.f15187e;
                        method = p25.f27328b;
                        if (method != null) {
                            method.invoke(workSource, Integer.valueOf(i6), str == null ? "" : str);
                        } else {
                            method2 = p25.f27327a;
                            if (method2 != null) {
                                method2.invoke(workSource, Integer.valueOf(i6));
                            }
                        }
                    }
                }
                cn2Var.f16154m = workSource;
            }
            if (z) {
                cn2Var.f16151j = 1;
            }
            if (z2) {
                cn2Var.f16152k = 2;
            }
            if (z3) {
                cn2Var.f16153l = true;
            }
            if (z4) {
                cn2Var.f16149h = true;
            }
            if (j != Long.MAX_VALUE) {
                cn2Var.m4051a(j);
            }
            i4 = cn2Var.f16142a;
            j2 = cn2Var.f16143b;
            j3 = cn2Var.f16144c;
            if (j3 == -1) {
                jMin = j2;
            } else {
                jMin = i4 != 105 ? Math.min(j3, j2) : j3;
            }
            long jMax2 = Math.max(cn2Var.f16145d, cn2Var.f16143b);
            long j10 = cn2Var.f16146e;
            int i11 = cn2Var.f16147f;
            float f3 = cn2Var.f16148g;
            boolean z9 = cn2Var.f16149h;
            long j11 = cn2Var.f16150i;
            this.f25391d = new LocationRequest(i4, j2, jMin, jMax2, Long.MAX_VALUE, j10, i11, f3, z9, j11 == -1 ? cn2Var.f16143b : j11, cn2Var.f16151j, cn2Var.f16152k, cn2Var.f16153l, new WorkSource(cn2Var.f16154m), cn2Var.f16155n);
        }
        i = i9;
        z5 = true;
        objArr = new Object[]{Integer.valueOf(i)};
        if (z5) {
            throw new IllegalArgumentException(String.format("granularity %d must be a Granularity.GRANULARITY_* constant", objArr));
        }
        cn2Var.f16151j = i9;
        i2 = locationRequest.f16247n;
        if (i2 == 0) {
            i3 = i2;
            z6 = true;
        } else {
            i3 = i2;
            z6 = true;
        }
        objArr2 = new Object[]{Integer.valueOf(i3)};
        if (!z6) {
            throw new IllegalArgumentException(String.format("throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", objArr2));
        }
        cn2Var.f16152k = i2;
        cn2Var.f16153l = locationRequest.f16248o;
        cn2Var.f16154m = locationRequest.f16249p;
        d16Var = locationRequest.f16250q;
        if (d16Var != null) {
            z7 = true;
        } else {
            z7 = true;
        }
        y42.m12849V(z7);
        cn2Var.f16155n = d16Var;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                size = arrayList.size();
                i5 = 0;
                while (i5 < size) {
                    Object obj3 = arrayList.get(i5);
                    i5++;
                    ba0 ba0Var3 = (ba0) obj3;
                    i6 = ba0Var3.f15186d;
                    str = ba0Var3.f15187e;
                    method = p25.f27328b;
                    if (method != null) {
                        method.invoke(workSource, Integer.valueOf(i6), str == null ? "" : str);
                    } else {
                        method2 = p25.f27327a;
                        if (method2 != null) {
                            method2.invoke(workSource, Integer.valueOf(i6));
                        }
                    }
                }
            }
            cn2Var.f16154m = workSource;
        }
        if (z) {
            cn2Var.f16151j = 1;
        }
        if (z2) {
            cn2Var.f16152k = 2;
        }
        if (z3) {
            cn2Var.f16153l = true;
        }
        if (z4) {
            cn2Var.f16149h = true;
        }
        if (j != Long.MAX_VALUE) {
            cn2Var.m4051a(j);
        }
        i4 = cn2Var.f16142a;
        j2 = cn2Var.f16143b;
        j3 = cn2Var.f16144c;
        if (j3 == -1) {
            jMin = j2;
        } else {
            jMin = i4 != 105 ? Math.min(j3, j2) : j3;
        }
        long jMax3 = Math.max(cn2Var.f16145d, cn2Var.f16143b);
        long j12 = cn2Var.f16146e;
        int i12 = cn2Var.f16147f;
        float f4 = cn2Var.f16148g;
        boolean z10 = cn2Var.f16149h;
        long j13 = cn2Var.f16150i;
        this.f25391d = new LocationRequest(i4, j2, jMin, jMax3, Long.MAX_VALUE, j12, i12, f4, z10, j13 == -1 ? cn2Var.f16143b : j13, cn2Var.f16151j, cn2Var.f16152k, cn2Var.f16153l, new WorkSource(cn2Var.f16154m), cn2Var.f16155n);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n16) {
            return AbstractC1356y5.m12927u(this.f25391d, ((n16) obj).f25391d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25391d.hashCode();
    }

    public final String toString() {
        return this.f25391d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9087L(parcel, 1, this.f25391d, i);
        oh6.m9094S(parcel, iM9092Q);
    }
}
