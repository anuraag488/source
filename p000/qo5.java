package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qo5 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28647a;

    public /* synthetic */ qo5(byte b) {
        this.f28647a = b;
    }

    /* JADX INFO: renamed from: a */
    public static void m9995a(is1 is1Var, Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        int i2 = is1Var.f21739d;
        oh6.m9091P(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = is1Var.f21740e;
        oh6.m9091P(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = is1Var.f21741f;
        oh6.m9091P(parcel, 3, 4);
        parcel.writeInt(i4);
        oh6.m9088M(parcel, 4, is1Var.f21742g);
        oh6.m9086K(parcel, 5, is1Var.f21743h);
        oh6.m9089N(parcel, 6, is1Var.f21744i, i);
        oh6.m9084I(parcel, 7, is1Var.f21745j);
        oh6.m9087L(parcel, 8, is1Var.f21746k, i);
        oh6.m9089N(parcel, 10, is1Var.f21747l, i);
        oh6.m9089N(parcel, 11, is1Var.f21748m, i);
        boolean z = is1Var.f21749n;
        oh6.m9091P(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = is1Var.f21750o;
        oh6.m9091P(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = is1Var.f21751p;
        oh6.m9091P(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        oh6.m9088M(parcel, 15, is1Var.f21752q);
        oh6.m9094S(parcel, iM9092Q);
    }

    /* JADX INFO: renamed from: b */
    public static void m9996b(ys5 ys5Var, Parcel parcel, int i) {
        String str = ys5Var.f35504d;
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9088M(parcel, 2, str);
        oh6.m9087L(parcel, 3, ys5Var.f35505e, i);
        oh6.m9088M(parcel, 4, ys5Var.f35506f);
        long j = ys5Var.f35507g;
        oh6.m9091P(parcel, 5, 8);
        parcel.writeLong(j);
        oh6.m9094S(parcel, iM9092Q);
    }

    /* JADX INFO: renamed from: c */
    public static void m9997c(xm6 xm6Var, Parcel parcel) {
        int i = xm6Var.f34427d;
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9091P(parcel, 1, 4);
        parcel.writeInt(i);
        oh6.m9088M(parcel, 2, xm6Var.f34428e);
        long j = xm6Var.f34429f;
        oh6.m9091P(parcel, 3, 8);
        parcel.writeLong(j);
        Long l = xm6Var.f34430g;
        if (l != null) {
            oh6.m9091P(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        oh6.m9088M(parcel, 6, xm6Var.f34431h);
        oh6.m9088M(parcel, 7, xm6Var.f34432i);
        Double d = xm6Var.f34433j;
        if (d != null) {
            oh6.m9091P(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        oh6.m9094S(parcel, iM9092Q);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long jM11832P = 0;
        switch (this.f28647a) {
            case 0:
                int iM11839W = vd6.m11839W(parcel);
                List listM11855n = LocationResult.f16251e;
                while (parcel.dataPosition() < iM11839W) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        vd6.m11836T(parcel, i);
                    } else {
                        listM11855n = vd6.m11855n(parcel, i, Location.CREATOR);
                    }
                }
                vd6.m11858q(parcel, iM11839W);
                LocationResult locationResult = new LocationResult();
                locationResult.f16252d = listM11855n;
                VarHandle.storeStoreFence();
                return locationResult;
            case 1:
                int iM11839W2 = vd6.m11839W(parcel);
                long jM11832P2 = 0;
                long jM11832P3 = 0;
                int iM11831O = 0;
                while (parcel.dataPosition() < iM11839W2) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 1) {
                        jM11832P2 = vd6.m11832P(parcel, i2);
                    } else if (c == 2) {
                        iM11831O = vd6.m11831O(parcel, i2);
                    } else if (c != 3) {
                        vd6.m11836T(parcel, i2);
                    } else {
                        jM11832P3 = vd6.m11832P(parcel, i2);
                    }
                }
                vd6.m11858q(parcel, iM11839W2);
                return new ko5(jM11832P2, iM11831O, jM11832P3);
            case 2:
                int iM11839W3 = vd6.m11839W(parcel);
                long jM11832P4 = 0;
                long jM11832P5 = 0;
                long jM11832P6 = 0;
                boolean zM11829M = false;
                String strM11853l = null;
                String strM11853l2 = null;
                xm6 xm6Var = null;
                String strM11853l3 = null;
                ys5 ys5Var = null;
                ys5 ys5Var2 = null;
                ys5 ys5Var3 = null;
                while (parcel.dataPosition() < iM11839W3) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 2:
                            strM11853l = vd6.m11853l(parcel, i3);
                            break;
                        case 3:
                            strM11853l2 = vd6.m11853l(parcel, i3);
                            break;
                        case 4:
                            xm6Var = (xm6) vd6.m11852k(parcel, i3, xm6.CREATOR);
                            break;
                        case 5:
                            jM11832P4 = vd6.m11832P(parcel, i3);
                            break;
                        case 6:
                            zM11829M = vd6.m11829M(parcel, i3);
                            break;
                        case 7:
                            strM11853l3 = vd6.m11853l(parcel, i3);
                            break;
                        case '\b':
                            ys5Var = (ys5) vd6.m11852k(parcel, i3, ys5.CREATOR);
                            break;
                        case '\t':
                            jM11832P5 = vd6.m11832P(parcel, i3);
                            break;
                        case '\n':
                            ys5Var2 = (ys5) vd6.m11852k(parcel, i3, ys5.CREATOR);
                            break;
                        case 11:
                            jM11832P6 = vd6.m11832P(parcel, i3);
                            break;
                        case '\f':
                            ys5Var3 = (ys5) vd6.m11852k(parcel, i3, ys5.CREATOR);
                            break;
                        default:
                            vd6.m11836T(parcel, i3);
                            break;
                    }
                }
                vd6.m11858q(parcel, iM11839W3);
                return new yo5(strM11853l, strM11853l2, xm6Var, jM11832P4, zM11829M, strM11853l3, ys5Var, jM11832P5, ys5Var2, jM11832P6, ys5Var3);
            case 3:
                int iM11839W4 = vd6.m11839W(parcel);
                int iM11831O2 = 1;
                int iM11831O3 = 1;
                long jM11832P7 = -1;
                long jM11832P8 = -1;
                while (parcel.dataPosition() < iM11839W4) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 1) {
                        iM11831O2 = vd6.m11831O(parcel, i4);
                    } else if (c2 == 2) {
                        iM11831O3 = vd6.m11831O(parcel, i4);
                    } else if (c2 == 3) {
                        jM11832P7 = vd6.m11832P(parcel, i4);
                    } else if (c2 != 4) {
                        vd6.m11836T(parcel, i4);
                    } else {
                        jM11832P8 = vd6.m11832P(parcel, i4);
                    }
                }
                vd6.m11858q(parcel, iM11839W4);
                np5 np5Var = new np5();
                np5Var.f26021d = iM11831O2;
                np5Var.f26022e = iM11831O3;
                np5Var.f26023f = jM11832P7;
                np5Var.f26024g = jM11832P8;
                VarHandle.storeStoreFence();
                return np5Var;
            case 4:
                int iM11839W5 = vd6.m11839W(parcel);
                Bundle bundleM11849h = null;
                while (parcel.dataPosition() < iM11839W5) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 1) {
                        vd6.m11836T(parcel, i5);
                    } else {
                        bundleM11849h = vd6.m11849h(parcel, i5);
                    }
                }
                vd6.m11858q(parcel, iM11839W5);
                return new bq5(bundleM11849h);
            case 5:
                int iM11839W6 = vd6.m11839W(parcel);
                int iM11831O4 = 0;
                boolean zM11829M2 = false;
                String strM11853l4 = null;
                long jM11832P9 = -1;
                while (parcel.dataPosition() < iM11839W6) {
                    int i6 = parcel.readInt();
                    char c3 = (char) i6;
                    if (c3 == 1) {
                        strM11853l4 = vd6.m11853l(parcel, i6);
                    } else if (c3 == 2) {
                        iM11831O4 = vd6.m11831O(parcel, i6);
                    } else if (c3 == 3) {
                        jM11832P9 = vd6.m11832P(parcel, i6);
                    } else if (c3 != 4) {
                        vd6.m11836T(parcel, i6);
                    } else {
                        zM11829M2 = vd6.m11829M(parcel, i6);
                    }
                }
                vd6.m11858q(parcel, iM11839W6);
                return new ed1(strM11853l4, iM11831O4, jM11832P9, zM11829M2);
            case 6:
                int iM11839W7 = vd6.m11839W(parcel);
                Bundle bundleM11849h2 = null;
                while (parcel.dataPosition() < iM11839W7) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 2) {
                        vd6.m11836T(parcel, i7);
                    } else {
                        bundleM11849h2 = vd6.m11849h(parcel, i7);
                    }
                }
                vd6.m11858q(parcel, iM11839W7);
                return new os5(bundleM11849h2);
            case 7:
                int iM11839W8 = vd6.m11839W(parcel);
                long jM11832P10 = 0;
                String strM11853l5 = null;
                os5 os5Var = null;
                String strM11853l6 = null;
                while (parcel.dataPosition() < iM11839W8) {
                    int i8 = parcel.readInt();
                    char c4 = (char) i8;
                    if (c4 == 2) {
                        strM11853l5 = vd6.m11853l(parcel, i8);
                    } else if (c4 == 3) {
                        os5Var = (os5) vd6.m11852k(parcel, i8, os5.CREATOR);
                    } else if (c4 == 4) {
                        strM11853l6 = vd6.m11853l(parcel, i8);
                    } else if (c4 != 5) {
                        vd6.m11836T(parcel, i8);
                    } else {
                        jM11832P10 = vd6.m11832P(parcel, i8);
                    }
                }
                vd6.m11858q(parcel, iM11839W8);
                return new ys5(strM11853l5, os5Var, strM11853l6, jM11832P10);
            case 8:
                int iM11839W9 = vd6.m11839W(parcel);
                int iM11831O5 = 0;
                String strM11853l7 = null;
                while (parcel.dataPosition() < iM11839W9) {
                    int i9 = parcel.readInt();
                    char c5 = (char) i9;
                    if (c5 == 1) {
                        iM11831O5 = vd6.m11831O(parcel, i9);
                    } else if (c5 != 2) {
                        vd6.m11836T(parcel, i9);
                    } else {
                        strM11853l7 = vd6.m11853l(parcel, i9);
                    }
                }
                vd6.m11858q(parcel, iM11839W9);
                return new Scope(iM11831O5, strM11853l7);
            case 9:
                int iM11839W10 = vd6.m11839W(parcel);
                int iM11831O6 = 0;
                String strM11853l8 = null;
                while (parcel.dataPosition() < iM11839W10) {
                    int i10 = parcel.readInt();
                    char c6 = (char) i10;
                    if (c6 == 1) {
                        strM11853l8 = vd6.m11853l(parcel, i10);
                    } else if (c6 != 2) {
                        vd6.m11836T(parcel, i10);
                    } else {
                        iM11831O6 = vd6.m11831O(parcel, i10);
                    }
                }
                vd6.m11858q(parcel, iM11839W10);
                rv5 rv5Var = new rv5();
                rv5Var.f29670d = strM11853l8;
                rv5Var.f29671e = iM11831O6;
                VarHandle.storeStoreFence();
                return rv5Var;
            case 10:
                int iM11839W11 = vd6.m11839W(parcel);
                long jM11832P11 = 0;
                long jM11832P12 = 0;
                boolean zM11829M3 = false;
                Bundle bundleM11849h3 = null;
                String strM11853l9 = null;
                while (parcel.dataPosition() < iM11839W11) {
                    int i11 = parcel.readInt();
                    char c7 = (char) i11;
                    if (c7 == 1) {
                        jM11832P11 = vd6.m11832P(parcel, i11);
                    } else if (c7 == 2) {
                        jM11832P12 = vd6.m11832P(parcel, i11);
                    } else if (c7 == 3) {
                        zM11829M3 = vd6.m11829M(parcel, i11);
                    } else if (c7 == 7) {
                        bundleM11849h3 = vd6.m11849h(parcel, i11);
                    } else if (c7 != '\b') {
                        vd6.m11836T(parcel, i11);
                    } else {
                        strM11853l9 = vd6.m11853l(parcel, i11);
                    }
                }
                vd6.m11858q(parcel, iM11839W11);
                return new mz5(jM11832P11, jM11832P12, zM11829M3, bundleM11849h3, strM11853l9);
            case 11:
                int iM11839W12 = vd6.m11839W(parcel);
                int iM11831O7 = 0;
                Intent intent = null;
                String strM11853l10 = null;
                while (parcel.dataPosition() < iM11839W12) {
                    int i12 = parcel.readInt();
                    char c8 = (char) i12;
                    if (c8 == 1) {
                        iM11831O7 = vd6.m11831O(parcel, i12);
                    } else if (c8 == 2) {
                        strM11853l10 = vd6.m11853l(parcel, i12);
                    } else if (c8 != 3) {
                        vd6.m11836T(parcel, i12);
                    } else {
                        intent = (Intent) vd6.m11852k(parcel, i12, Intent.CREATOR);
                    }
                }
                vd6.m11858q(parcel, iM11839W12);
                return new pz5(iM11831O7, strM11853l10, intent);
            case 12:
                int iM11839W13 = vd6.m11839W(parcel);
                int iM11831O8 = 0;
                PendingIntent pendingIntent = null;
                String strM11853l11 = null;
                lk0 lk0Var = null;
                while (parcel.dataPosition() < iM11839W13) {
                    int i13 = parcel.readInt();
                    char c9 = (char) i13;
                    if (c9 == 1) {
                        iM11831O8 = vd6.m11831O(parcel, i13);
                    } else if (c9 == 2) {
                        strM11853l11 = vd6.m11853l(parcel, i13);
                    } else if (c9 == 3) {
                        pendingIntent = (PendingIntent) vd6.m11852k(parcel, i13, PendingIntent.CREATOR);
                    } else if (c9 != 4) {
                        vd6.m11836T(parcel, i13);
                    } else {
                        lk0Var = (lk0) vd6.m11852k(parcel, i13, lk0.CREATOR);
                    }
                }
                vd6.m11858q(parcel, iM11839W13);
                return new Status(iM11831O8, strM11853l11, pendingIntent, lk0Var);
            case 13:
                int iM11839W14 = vd6.m11839W(parcel);
                int iM11831O9 = 0;
                IBinder iBinderM11830N = null;
                IBinder iBinderM11830N2 = null;
                PendingIntent pendingIntent2 = null;
                String strM11853l12 = null;
                while (parcel.dataPosition() < iM11839W14) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 1) {
                        iM11831O9 = vd6.m11831O(parcel, i14);
                    } else if (c10 == 2) {
                        iBinderM11830N = vd6.m11830N(parcel, i14);
                    } else if (c10 == 3) {
                        iBinderM11830N2 = vd6.m11830N(parcel, i14);
                    } else if (c10 == 4) {
                        pendingIntent2 = (PendingIntent) vd6.m11852k(parcel, i14, PendingIntent.CREATOR);
                    } else if (c10 != 6) {
                        vd6.m11836T(parcel, i14);
                    } else {
                        strM11853l12 = vd6.m11853l(parcel, i14);
                    }
                }
                vd6.m11858q(parcel, iM11839W14);
                return new l16(iM11831O9, iBinderM11830N, iBinderM11830N2, pendingIntent2, strM11853l12);
            case 14:
                int iM11839W15 = vd6.m11839W(parcel);
                long jM11832P13 = Long.MAX_VALUE;
                boolean zM11829M4 = false;
                boolean zM11829M5 = false;
                boolean zM11829M6 = false;
                boolean zM11829M7 = false;
                LocationRequest locationRequest = null;
                ArrayList arrayListM11855n = null;
                while (parcel.dataPosition() < iM11839W15) {
                    int i15 = parcel.readInt();
                    char c11 = (char) i15;
                    if (c11 == 1) {
                        locationRequest = (LocationRequest) vd6.m11852k(parcel, i15, LocationRequest.CREATOR);
                    } else if (c11 == 5) {
                        arrayListM11855n = vd6.m11855n(parcel, i15, ba0.CREATOR);
                    } else if (c11 == '\b') {
                        zM11829M4 = vd6.m11829M(parcel, i15);
                    } else if (c11 != '\t') {
                        switch (c11) {
                            case 11:
                                zM11829M6 = vd6.m11829M(parcel, i15);
                                break;
                            case '\f':
                                zM11829M7 = vd6.m11829M(parcel, i15);
                                break;
                            case '\r':
                                vd6.m11853l(parcel, i15);
                                break;
                            case 14:
                                jM11832P13 = vd6.m11832P(parcel, i15);
                                break;
                            default:
                                vd6.m11836T(parcel, i15);
                                break;
                        }
                    } else {
                        zM11829M5 = vd6.m11829M(parcel, i15);
                    }
                }
                vd6.m11858q(parcel, iM11839W15);
                return new n16(locationRequest, arrayListM11855n, zM11829M4, zM11829M5, zM11829M6, zM11829M7, jM11832P13);
            case 15:
                int iM11839W16 = vd6.m11839W(parcel);
                int iM11831O10 = 1;
                n16 n16Var = null;
                IBinder iBinderM11830N3 = null;
                IBinder iBinderM11830N4 = null;
                PendingIntent pendingIntent3 = null;
                IBinder iBinderM11830N5 = null;
                String strM11853l13 = null;
                while (parcel.dataPosition() < iM11839W16) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            iM11831O10 = vd6.m11831O(parcel, i16);
                            break;
                        case 2:
                            n16Var = (n16) vd6.m11852k(parcel, i16, n16.CREATOR);
                            break;
                        case 3:
                            iBinderM11830N3 = vd6.m11830N(parcel, i16);
                            break;
                        case 4:
                            pendingIntent3 = (PendingIntent) vd6.m11852k(parcel, i16, PendingIntent.CREATOR);
                            break;
                        case 5:
                            iBinderM11830N4 = vd6.m11830N(parcel, i16);
                            break;
                        case 6:
                            iBinderM11830N5 = vd6.m11830N(parcel, i16);
                            break;
                        case 7:
                        default:
                            vd6.m11836T(parcel, i16);
                            break;
                        case '\b':
                            strM11853l13 = vd6.m11853l(parcel, i16);
                            break;
                    }
                }
                vd6.m11858q(parcel, iM11839W16);
                return new q16(iM11831O10, n16Var, iBinderM11830N3, iBinderM11830N4, pendingIntent3, iBinderM11830N5, strM11853l13);
            case 16:
                int iM11839W17 = vd6.m11839W(parcel);
                String strM11853l14 = null;
                String strM11853l15 = null;
                String strM11853l16 = null;
                Collection collectionM11855n = null;
                d16 d16Var = null;
                int iM11831O11 = 0;
                while (parcel.dataPosition() < iM11839W17) {
                    int i17 = parcel.readInt();
                    char c12 = (char) i17;
                    if (c12 == 1) {
                        iM11831O11 = vd6.m11831O(parcel, i17);
                    } else if (c12 == 3) {
                        strM11853l14 = vd6.m11853l(parcel, i17);
                    } else if (c12 == 4) {
                        strM11853l15 = vd6.m11853l(parcel, i17);
                    } else if (c12 == 6) {
                        strM11853l16 = vd6.m11853l(parcel, i17);
                    } else if (c12 == 7) {
                        d16Var = (d16) vd6.m11852k(parcel, i17, d16.CREATOR);
                    } else if (c12 != '\b') {
                        vd6.m11836T(parcel, i17);
                    } else {
                        collectionM11855n = vd6.m11855n(parcel, i17, ed1.CREATOR);
                    }
                }
                vd6.m11858q(parcel, iM11839W17);
                d16 d16Var2 = new d16();
                if (d16Var != null && d16Var.f16737i != null) {
                    C1077qn.m9987m("Failed requirement.");
                    return null;
                }
                d16Var2.f16732d = iM11831O11;
                d16Var2.f16733e = strM11853l14;
                d16Var2.f16734f = strM11853l15;
                if (strM11853l16 == null) {
                    strM11853l16 = d16Var != null ? d16Var.f16735g : null;
                }
                d16Var2.f16735g = strM11853l16;
                if (collectionM11855n == null) {
                    d36 d36Var = d16Var != null ? d16Var.f16736h : null;
                    if (d36Var == null) {
                        w26 w26Var = d36.f16766b;
                        collectionM11855n = g36.f19596e;
                    } else {
                        collectionM11855n = d36Var;
                    }
                }
                w26 w26Var2 = d36.f16766b;
                Object[] array = collectionM11855n.toArray();
                int length = array.length;
                for (int i18 = 0; i18 < length; i18++) {
                    if (array[i18] == null) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i18).length() + 9);
                        sb.append("at index ");
                        sb.append(i18);
                        throw new NullPointerException(sb.toString());
                    }
                }
                d16Var2.f16736h = length == 0 ? g36.f19596e : new g36(length, array);
                d16Var2.f16737i = d16Var;
                VarHandle.storeStoreFence();
                return d16Var2;
            case 17:
                int iM11839W18 = vd6.m11839W(parcel);
                d16 d16Var3 = null;
                WorkSource workSource = new WorkSource();
                int iM11831O12 = 102;
                long jM11832P14 = Long.MAX_VALUE;
                long jM11832P15 = Long.MAX_VALUE;
                int iM11831O13 = 0;
                boolean zM11829M8 = false;
                int iM11831O14 = 0;
                while (parcel.dataPosition() < iM11839W18) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            jM11832P14 = vd6.m11832P(parcel, i19);
                            break;
                        case 2:
                            iM11831O13 = vd6.m11831O(parcel, i19);
                            break;
                        case 3:
                            iM11831O12 = vd6.m11831O(parcel, i19);
                            break;
                        case 4:
                            jM11832P15 = vd6.m11832P(parcel, i19);
                            break;
                        case 5:
                            zM11829M8 = vd6.m11829M(parcel, i19);
                            break;
                        case 6:
                            workSource = (WorkSource) vd6.m11852k(parcel, i19, WorkSource.CREATOR);
                            break;
                        case 7:
                            iM11831O14 = vd6.m11831O(parcel, i19);
                            break;
                        case '\b':
                        default:
                            vd6.m11836T(parcel, i19);
                            break;
                        case '\t':
                            d16Var3 = (d16) vd6.m11852k(parcel, i19, d16.CREATOR);
                            break;
                    }
                }
                vd6.m11858q(parcel, iM11839W18);
                return new cs0(jM11832P14, iM11831O13, iM11831O12, jM11832P15, zM11829M8, iM11831O14, workSource, d16Var3);
            case 18:
                ed1[] ed1VarArr = null;
                int iM11839W19 = vd6.m11839W(parcel);
                Bundle bundleM11849h4 = null;
                qk0 qk0Var = null;
                int iM11831O15 = 0;
                while (parcel.dataPosition() < iM11839W19) {
                    int i20 = parcel.readInt();
                    char c13 = (char) i20;
                    if (c13 == 1) {
                        bundleM11849h4 = vd6.m11849h(parcel, i20);
                    } else if (c13 == 2) {
                        ed1VarArr = (ed1[]) vd6.m11854m(parcel, i20, ed1.CREATOR);
                    } else if (c13 == 3) {
                        iM11831O15 = vd6.m11831O(parcel, i20);
                    } else if (c13 != 4) {
                        vd6.m11836T(parcel, i20);
                    } else {
                        qk0Var = (qk0) vd6.m11852k(parcel, i20, qk0.CREATOR);
                    }
                }
                vd6.m11858q(parcel, iM11839W19);
                cc6 cc6Var = new cc6();
                cc6Var.f15932d = bundleM11849h4;
                cc6Var.f15933e = ed1VarArr;
                cc6Var.f15934f = iM11831O15;
                cc6Var.f15935g = qk0Var;
                return cc6Var;
            case 19:
                int iM11839W20 = vd6.m11839W(parcel);
                br3 br3Var = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean zM11829M9 = false;
                boolean zM11829M10 = false;
                int iM11831O16 = 0;
                while (parcel.dataPosition() < iM11839W20) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            br3Var = (br3) vd6.m11852k(parcel, i21, br3.CREATOR);
                            break;
                        case 2:
                            zM11829M9 = vd6.m11829M(parcel, i21);
                            break;
                        case 3:
                            zM11829M10 = vd6.m11829M(parcel, i21);
                            break;
                        case 4:
                            int iM11833Q = vd6.m11833Q(parcel, i21);
                            int iDataPosition = parcel.dataPosition();
                            if (iM11833Q == 0) {
                                iArr = null;
                            } else {
                                int[] iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition + iM11833Q);
                                iArr = iArrCreateIntArray;
                            }
                            break;
                        case 5:
                            iM11831O16 = vd6.m11831O(parcel, i21);
                            break;
                        case 6:
                            int iM11833Q2 = vd6.m11833Q(parcel, i21);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iM11833Q2 == 0) {
                                iArr2 = null;
                            } else {
                                int[] iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iM11833Q2);
                                iArr2 = iArrCreateIntArray2;
                            }
                            break;
                        default:
                            vd6.m11836T(parcel, i21);
                            break;
                    }
                }
                vd6.m11858q(parcel, iM11839W20);
                qk0 qk0Var2 = new qk0();
                qk0Var2.f28534d = br3Var;
                qk0Var2.f28535e = zM11829M9;
                qk0Var2.f28536f = zM11829M10;
                qk0Var2.f28537g = iArr;
                qk0Var2.f28538h = iM11831O16;
                qk0Var2.f28539i = iArr2;
                VarHandle.storeStoreFence();
                return qk0Var2;
            case 20:
                int iM11839W21 = vd6.m11839W(parcel);
                String strM11853l17 = null;
                IBinder iBinderM11830N6 = null;
                Account account = null;
                String strM11853l18 = null;
                Bundle bundle = new Bundle();
                Scope[] scopeArr = is1.f21737r;
                ed1[] ed1VarArr2 = is1.f21738s;
                ed1[] ed1VarArr3 = ed1VarArr2;
                int iM11831O17 = 0;
                int iM11831O18 = 0;
                int iM11831O19 = 0;
                boolean zM11829M11 = false;
                int iM11831O20 = 0;
                boolean zM11829M12 = false;
                while (parcel.dataPosition() < iM11839W21) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 1:
                            iM11831O17 = vd6.m11831O(parcel, i22);
                            break;
                        case 2:
                            iM11831O18 = vd6.m11831O(parcel, i22);
                            break;
                        case 3:
                            iM11831O19 = vd6.m11831O(parcel, i22);
                            break;
                        case 4:
                            strM11853l17 = vd6.m11853l(parcel, i22);
                            break;
                        case 5:
                            iBinderM11830N6 = vd6.m11830N(parcel, i22);
                            break;
                        case 6:
                            scopeArr = (Scope[]) vd6.m11854m(parcel, i22, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = vd6.m11849h(parcel, i22);
                            break;
                        case '\b':
                            account = (Account) vd6.m11852k(parcel, i22, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            vd6.m11836T(parcel, i22);
                            break;
                        case '\n':
                            ed1VarArr2 = (ed1[]) vd6.m11854m(parcel, i22, ed1.CREATOR);
                            break;
                        case 11:
                            ed1VarArr3 = (ed1[]) vd6.m11854m(parcel, i22, ed1.CREATOR);
                            break;
                        case '\f':
                            zM11829M11 = vd6.m11829M(parcel, i22);
                            break;
                        case '\r':
                            iM11831O20 = vd6.m11831O(parcel, i22);
                            break;
                        case 14:
                            zM11829M12 = vd6.m11829M(parcel, i22);
                            break;
                        case 15:
                            strM11853l18 = vd6.m11853l(parcel, i22);
                            break;
                    }
                }
                vd6.m11858q(parcel, iM11839W21);
                return new is1(iM11831O17, iM11831O18, iM11831O19, strM11853l17, iBinderM11830N6, scopeArr, bundle, account, ed1VarArr2, ed1VarArr3, zM11829M11, iM11831O20, zM11829M12, strM11853l18);
            case 21:
                int iM11839W22 = vd6.m11839W(parcel);
                Status status = null;
                while (parcel.dataPosition() < iM11839W22) {
                    int i23 = parcel.readInt();
                    if (((char) i23) != 1) {
                        vd6.m11836T(parcel, i23);
                    } else {
                        status = (Status) vd6.m11852k(parcel, i23, Status.CREATOR);
                    }
                }
                vd6.m11858q(parcel, iM11839W22);
                vf6 vf6Var = new vf6();
                vf6Var.f32580d = status;
                VarHandle.storeStoreFence();
                return vf6Var;
            case 22:
                if3 if3Var = new if3();
                String string = parcel.readString();
                Objects.requireNonNull(string);
                if3Var.f21339a = string;
                String string2 = parcel.readString();
                Objects.requireNonNull(string2);
                if3Var.f21340b = string2;
                if (parcel.readByte() != 0) {
                    if3Var.f21341c = parcel.readStrongBinder();
                } else {
                    if3Var.f21341c = null;
                }
                Bundle bundle2 = parcel.readBundle(if3.class.getClassLoader());
                if (bundle2 == null) {
                    bundle2 = Bundle.EMPTY;
                }
                if3Var.f21342d = bundle2;
                VarHandle.storeStoreFence();
                return if3Var;
            case 23:
                ao3 ao3Var = new ao3();
                String string3 = parcel.readString();
                Objects.requireNonNull(string3);
                ao3Var.f14744a = string3;
                ao3Var.f14745b = parcel.readInt();
                ao3Var.f14746c = parcel.readInt();
                String string4 = parcel.readString();
                Objects.requireNonNull(string4);
                ao3Var.f14747d = string4;
                ao3Var.f14748e = parcel.readLong();
                VarHandle.storeStoreFence();
                return ao3Var;
            case 24:
                int iM11839W23 = vd6.m11839W(parcel);
                int iM11831O21 = 0;
                String strM11853l19 = null;
                while (parcel.dataPosition() < iM11839W23) {
                    int i24 = parcel.readInt();
                    char c14 = (char) i24;
                    if (c14 == 1) {
                        strM11853l19 = vd6.m11853l(parcel, i24);
                    } else if (c14 == 2) {
                        jM11832P = vd6.m11832P(parcel, i24);
                    } else if (c14 != 3) {
                        vd6.m11836T(parcel, i24);
                    } else {
                        iM11831O21 = vd6.m11831O(parcel, i24);
                    }
                }
                vd6.m11858q(parcel, iM11839W23);
                return new cl6(iM11831O21, jM11832P, strM11853l19);
            case 25:
                int iM11839W24 = vd6.m11839W(parcel);
                long jM11832P16 = 0;
                long jM11832P17 = 0;
                int iM11831O22 = 0;
                byte[] bArrM11850i = null;
                String strM11853l20 = null;
                Bundle bundleM11849h5 = null;
                String strM11853l21 = null;
                while (parcel.dataPosition() < iM11839W24) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 1:
                            jM11832P16 = vd6.m11832P(parcel, i25);
                            break;
                        case 2:
                            bArrM11850i = vd6.m11850i(parcel, i25);
                            break;
                        case 3:
                            strM11853l20 = vd6.m11853l(parcel, i25);
                            break;
                        case 4:
                            bundleM11849h5 = vd6.m11849h(parcel, i25);
                            break;
                        case 5:
                            iM11831O22 = vd6.m11831O(parcel, i25);
                            break;
                        case 6:
                            jM11832P17 = vd6.m11832P(parcel, i25);
                            break;
                        case 7:
                            strM11853l21 = vd6.m11853l(parcel, i25);
                            break;
                        default:
                            vd6.m11836T(parcel, i25);
                            break;
                    }
                }
                vd6.m11858q(parcel, iM11839W24);
                return new jl6(jM11832P16, bArrM11850i, strM11853l20, bundleM11849h5, iM11831O22, jM11832P17, strM11853l21);
            case 26:
                int iM11839W25 = vd6.m11839W(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (true) {
                        if (parcel.dataPosition() >= iM11839W25) {
                            vd6.m11858q(parcel, iM11839W25);
                            return new ll6(arrayList);
                        }
                        int i26 = parcel.readInt();
                        if (((char) i26) != 1) {
                            vd6.m11836T(parcel, i26);
                        } else {
                            int iM11833Q3 = vd6.m11833Q(parcel, i26);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iM11833Q3 == 0) {
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int i27 = parcel.readInt();
                            for (int i28 = 0; i28 < i27; i28++) {
                                arrayList2.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(iDataPosition3 + iM11833Q3);
                            arrayList = arrayList2;
                        }
                        break;
                    }
                }
                break;
            case 27:
                int iM11839W26 = vd6.m11839W(parcel);
                ArrayList arrayListM11855n2 = null;
                while (parcel.dataPosition() < iM11839W26) {
                    int i29 = parcel.readInt();
                    if (((char) i29) != 1) {
                        vd6.m11836T(parcel, i29);
                    } else {
                        arrayListM11855n2 = vd6.m11855n(parcel, i29, jl6.CREATOR);
                    }
                }
                vd6.m11858q(parcel, iM11839W26);
                return new ol6(arrayListM11855n2);
            case 28:
                int iM11839W27 = vd6.m11839W(parcel);
                int iM11831O23 = 0;
                String strM11853l22 = null;
                Long lValueOf = null;
                Float fValueOf = null;
                String strM11853l23 = null;
                String strM11853l24 = null;
                while (true) {
                    Double dValueOf = null;
                    while (true) {
                        if (parcel.dataPosition() >= iM11839W27) {
                            vd6.m11858q(parcel, iM11839W27);
                            xm6 xm6Var2 = new xm6();
                            xm6Var2.f34427d = iM11831O23;
                            xm6Var2.f34428e = strM11853l22;
                            xm6Var2.f34429f = jM11832P;
                            xm6Var2.f34430g = lValueOf;
                            xm6Var2.f34433j = iM11831O23 == 1 ? fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null : dValueOf;
                            xm6Var2.f34431h = strM11853l23;
                            xm6Var2.f34432i = strM11853l24;
                            VarHandle.storeStoreFence();
                            return xm6Var2;
                        }
                        int i30 = parcel.readInt();
                        switch ((char) i30) {
                            case 1:
                                iM11831O23 = vd6.m11831O(parcel, i30);
                                break;
                            case 2:
                                strM11853l22 = vd6.m11853l(parcel, i30);
                                break;
                            case 3:
                                jM11832P = vd6.m11832P(parcel, i30);
                                break;
                            case 4:
                                int iM11833Q4 = vd6.m11833Q(parcel, i30);
                                if (iM11833Q4 == 0) {
                                    lValueOf = null;
                                } else {
                                    vd6.m11841Y(parcel, iM11833Q4, 8);
                                    lValueOf = Long.valueOf(parcel.readLong());
                                }
                                break;
                            case 5:
                                int iM11833Q5 = vd6.m11833Q(parcel, i30);
                                if (iM11833Q5 == 0) {
                                    fValueOf = null;
                                } else {
                                    vd6.m11841Y(parcel, iM11833Q5, 4);
                                    fValueOf = Float.valueOf(parcel.readFloat());
                                }
                                break;
                            case 6:
                                strM11853l23 = vd6.m11853l(parcel, i30);
                                break;
                            case 7:
                                strM11853l24 = vd6.m11853l(parcel, i30);
                                break;
                            case '\b':
                                int iM11833Q6 = vd6.m11833Q(parcel, i30);
                                if (iM11833Q6 == 0) {
                                }
                                vd6.m11841Y(parcel, iM11833Q6, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                                break;
                                break;
                            default:
                                vd6.m11836T(parcel, i30);
                                break;
                        }
                    }
                }
                break;
            default:
                int iM11839W28 = vd6.m11839W(parcel);
                String strM11853l25 = "";
                int iM11831O24 = 100;
                long jM11832P18 = -2147483648L;
                long jM11832P19 = 0;
                long jM11832P20 = 0;
                long jM11832P21 = 0;
                long jM11832P22 = 0;
                long jM11832P23 = 0;
                long jM11832P24 = 0;
                boolean zM11829M13 = false;
                int iM11831O25 = 0;
                boolean zM11829M14 = false;
                boolean zM11829M15 = false;
                int iM11831O26 = 0;
                int iM11831O27 = 0;
                boolean zM11829M16 = true;
                boolean zM11829M17 = true;
                String strM11853l26 = null;
                String strM11853l27 = null;
                String strM11853l28 = null;
                String strM11853l29 = null;
                String strM11853l30 = null;
                String strM11853l31 = null;
                Boolean boolValueOf = null;
                ArrayList<String> arrayList3 = null;
                String strM11853l32 = null;
                String strM11853l33 = null;
                String strM11853l34 = "";
                String strM11853l35 = strM11853l34;
                String strM11853l36 = strM11853l35;
                while (parcel.dataPosition() < iM11839W28) {
                    int i31 = parcel.readInt();
                    String str = strM11853l36;
                    switch ((char) i31) {
                        case 2:
                            strM11853l26 = vd6.m11853l(parcel, i31);
                            break;
                        case 3:
                            strM11853l27 = vd6.m11853l(parcel, i31);
                            break;
                        case 4:
                            strM11853l28 = vd6.m11853l(parcel, i31);
                            break;
                        case 5:
                            strM11853l29 = vd6.m11853l(parcel, i31);
                            break;
                        case 6:
                            jM11832P = vd6.m11832P(parcel, i31);
                            break;
                        case 7:
                            jM11832P20 = vd6.m11832P(parcel, i31);
                            break;
                        case '\b':
                            strM11853l30 = vd6.m11853l(parcel, i31);
                            break;
                        case '\t':
                            zM11829M16 = vd6.m11829M(parcel, i31);
                            break;
                        case '\n':
                            zM11829M13 = vd6.m11829M(parcel, i31);
                            break;
                        case 11:
                            jM11832P18 = vd6.m11832P(parcel, i31);
                            break;
                        case '\f':
                            strM11853l31 = vd6.m11853l(parcel, i31);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            vd6.m11836T(parcel, i31);
                            break;
                        case 14:
                            jM11832P19 = vd6.m11832P(parcel, i31);
                            break;
                        case 15:
                            iM11831O25 = vd6.m11831O(parcel, i31);
                            break;
                        case 16:
                            zM11829M17 = vd6.m11829M(parcel, i31);
                            break;
                        case 18:
                            zM11829M14 = vd6.m11829M(parcel, i31);
                            break;
                        case 21:
                            int iM11833Q7 = vd6.m11833Q(parcel, i31);
                            if (iM11833Q7 == 0) {
                                boolValueOf = null;
                            } else {
                                vd6.m11841Y(parcel, iM11833Q7, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            }
                            break;
                        case 22:
                            jM11832P21 = vd6.m11832P(parcel, i31);
                            break;
                        case 23:
                            int iM11833Q8 = vd6.m11833Q(parcel, i31);
                            int iDataPosition4 = parcel.dataPosition();
                            if (iM11833Q8 == 0) {
                                arrayList3 = null;
                            } else {
                                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                                parcel.setDataPosition(iDataPosition4 + iM11833Q8);
                                arrayList3 = arrayListCreateStringArrayList;
                            }
                            break;
                        case 25:
                            strM11853l25 = vd6.m11853l(parcel, i31);
                            break;
                        case 26:
                            strM11853l34 = vd6.m11853l(parcel, i31);
                            break;
                        case 27:
                            strM11853l32 = vd6.m11853l(parcel, i31);
                            break;
                        case 28:
                            zM11829M15 = vd6.m11829M(parcel, i31);
                            break;
                        case 29:
                            jM11832P22 = vd6.m11832P(parcel, i31);
                            break;
                        case 30:
                            iM11831O24 = vd6.m11831O(parcel, i31);
                            break;
                        case 31:
                            strM11853l35 = vd6.m11853l(parcel, i31);
                            break;
                        case ' ':
                            iM11831O26 = vd6.m11831O(parcel, i31);
                            break;
                        case '\"':
                            jM11832P23 = vd6.m11832P(parcel, i31);
                            break;
                        case '#':
                            strM11853l33 = vd6.m11853l(parcel, i31);
                            break;
                        case '$':
                            strM11853l36 = vd6.m11853l(parcel, i31);
                            continue;
                        case '%':
                            jM11832P24 = vd6.m11832P(parcel, i31);
                            break;
                        case '&':
                            iM11831O27 = vd6.m11831O(parcel, i31);
                            break;
                    }
                    strM11853l36 = str;
                }
                vd6.m11858q(parcel, iM11839W28);
                cp6 cp6Var = new cp6();
                cp6Var.f16349d = strM11853l26;
                cp6Var.f16350e = strM11853l27;
                cp6Var.f16351f = strM11853l28;
                cp6Var.f16358m = jM11832P18;
                cp6Var.f16352g = strM11853l29;
                cp6Var.f16353h = jM11832P;
                cp6Var.f16354i = jM11832P20;
                cp6Var.f16355j = strM11853l30;
                cp6Var.f16356k = zM11829M16;
                cp6Var.f16357l = zM11829M13;
                cp6Var.f16359n = strM11853l31;
                cp6Var.f16360o = jM11832P19;
                cp6Var.f16361p = iM11831O25;
                cp6Var.f16362q = zM11829M17;
                cp6Var.f16363r = zM11829M14;
                cp6Var.f16364s = boolValueOf;
                cp6Var.f16365t = jM11832P21;
                cp6Var.f16366u = arrayList3;
                cp6Var.f16367v = strM11853l25;
                cp6Var.f16368w = strM11853l34;
                cp6Var.f16369x = strM11853l32;
                cp6Var.f16370y = zM11829M15;
                cp6Var.f16371z = jM11832P22;
                cp6Var.f16341A = iM11831O24;
                cp6Var.f16342B = strM11853l35;
                cp6Var.f16343C = iM11831O26;
                cp6Var.f16344D = jM11832P23;
                cp6Var.f16345E = strM11853l33;
                cp6Var.f16346F = strM11853l36;
                cp6Var.f16347G = jM11832P24;
                cp6Var.f16348H = iM11831O27;
                VarHandle.storeStoreFence();
                return cp6Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f28647a) {
            case 0:
                return new LocationResult[i];
            case 1:
                return new ko5[i];
            case 2:
                return new yo5[i];
            case 3:
                return new np5[i];
            case 4:
                return new bq5[i];
            case 5:
                return new ed1[i];
            case 6:
                return new os5[i];
            case 7:
                return new ys5[i];
            case 8:
                return new Scope[i];
            case 9:
                return new rv5[i];
            case 10:
                return new mz5[i];
            case 11:
                return new pz5[i];
            case 12:
                return new Status[i];
            case 13:
                return new l16[i];
            case 14:
                return new n16[i];
            case 15:
                return new q16[i];
            case 16:
                return new d16[i];
            case 17:
                return new cs0[i];
            case 18:
                return new cc6[i];
            case 19:
                return new qk0[i];
            case 20:
                return new is1[i];
            case 21:
                return new vf6[i];
            case 22:
                return new if3[i];
            case 23:
                return new ao3[i];
            case 24:
                return new cl6[i];
            case 25:
                return new jl6[i];
            case 26:
                return new ll6[i];
            case 27:
                return new ol6[i];
            case 28:
                return new xm6[i];
            default:
                return new cp6[i];
        }
    }
}
