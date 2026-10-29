package p000;

import ads_mobile_sdk.am0;
import ads_mobile_sdk.dy2;
import ads_mobile_sdk.lr0;
import ads_mobile_sdk.r01;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import android.text.TextUtils;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: w4 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1280w4 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33063a;

    public /* synthetic */ C1280w4(byte b) {
        this.f33063a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long jM11832P = 0;
        int iM11831O = 1;
        int iM11831O2 = 0;
        np5[] np5VarArr = null;
        IBinder iBinderM11830N = null;
        Account account = null;
        lk0 lk0Var = null;
        Intent intent = null;
        ArrayList arrayListM11855n = null;
        String strM11853l = null;
        String strM11853l2 = null;
        byte[] bArrM11850i = null;
        String strM11853l3 = null;
        switch (this.f33063a) {
            case 0:
                return new C1318x4(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 1:
                C0628ew c0628ew = new C0628ew();
                c0628ew.f18518a = parcel.createIntArray();
                c0628ew.f18519b = parcel.createStringArrayList();
                c0628ew.f18520c = parcel.createIntArray();
                c0628ew.f18521d = parcel.createIntArray();
                c0628ew.f18522e = parcel.readInt();
                c0628ew.f18523f = parcel.readString();
                c0628ew.f18524g = parcel.readInt();
                c0628ew.f18525h = parcel.readInt();
                Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
                c0628ew.f18526i = (CharSequence) creator.createFromParcel(parcel);
                c0628ew.f18527j = parcel.readInt();
                c0628ew.f18528k = (CharSequence) creator.createFromParcel(parcel);
                c0628ew.f18529l = parcel.createStringArrayList();
                c0628ew.f18530m = parcel.createStringArrayList();
                c0628ew.f18531n = parcel.readInt() != 0;
                VarHandle.storeStoreFence();
                return c0628ew;
            case 2:
                C0666fw c0666fw = new C0666fw();
                c0666fw.f19348a = parcel.createStringArrayList();
                c0666fw.f19349b = parcel.createTypedArrayList(C0628ew.CREATOR);
                VarHandle.storeStoreFence();
                return c0666fw;
            case 3:
                return new hw0(parcel.readInt());
            case 4:
                ao1 ao1Var = new ao1();
                ao1Var.f14741a = parcel.readString();
                ao1Var.f14742b = parcel.readInt();
                return ao1Var;
            case 5:
                fo1 fo1Var = new fo1();
                fo1Var.f19175e = null;
                fo1Var.f19176f = new ArrayList();
                fo1Var.f19177g = new ArrayList();
                fo1Var.f19171a = parcel.createStringArrayList();
                fo1Var.f19172b = parcel.createStringArrayList();
                fo1Var.f19173c = (C0628ew[]) parcel.createTypedArray(C0628ew.CREATOR);
                fo1Var.f19174d = parcel.readInt();
                fo1Var.f19175e = parcel.readString();
                fo1Var.f19176f = parcel.createStringArrayList();
                fo1Var.f19177g = parcel.createTypedArrayList(C0666fw.CREATOR);
                fo1Var.f19178h = parcel.createTypedArrayList(ao1.CREATOR);
                return fo1Var;
            case 6:
                ko1 ko1Var = new ko1();
                ko1Var.f23271a = parcel.readString();
                ko1Var.f23272b = parcel.readString();
                ko1Var.f23273c = parcel.readInt() != 0;
                ko1Var.f23274d = parcel.readInt() != 0;
                ko1Var.f23275e = parcel.readInt();
                ko1Var.f23276f = parcel.readInt();
                ko1Var.f23277g = parcel.readString();
                ko1Var.f23278h = parcel.readInt() != 0;
                ko1Var.f23279i = parcel.readInt() != 0;
                ko1Var.f23280j = parcel.readInt() != 0;
                ko1Var.f23281k = parcel.readInt() != 0;
                ko1Var.f23282l = parcel.readInt();
                ko1Var.f23283m = parcel.readString();
                ko1Var.f23284n = parcel.readInt();
                ko1Var.f23285o = parcel.readInt() != 0;
                VarHandle.storeStoreFence();
                return ko1Var;
            case 7:
                return new b62((IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader()), (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 8:
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                while (iM11831O2 < i) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                    iM11831O2++;
                }
                return new gs2(string, linkedHashMap);
            case 9:
                ParcelImpl parcelImpl = new ParcelImpl();
                parcelImpl.f14679a = new rx4(parcel).m10163g();
                VarHandle.storeStoreFence();
                return parcelImpl;
            case 10:
                return new z73(parcel.readFloat());
            case 11:
                return new a83(parcel.readInt());
            case 12:
                return new b83(parcel.readLong());
            case 13:
                int iM11839W = vd6.m11839W(parcel);
                while (parcel.dataPosition() < iM11839W) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 1) {
                        vd6.m11836T(parcel, i2);
                    } else {
                        strM11853l3 = vd6.m11853l(parcel, i2);
                    }
                }
                vd6.m11858q(parcel, iM11839W);
                return new am0(strM11853l3);
            case 14:
                int iM11839W2 = vd6.m11839W(parcel);
                int iM11831O3 = 0;
                while (parcel.dataPosition() < iM11839W2) {
                    int i3 = parcel.readInt();
                    char c = (char) i3;
                    if (c == 1) {
                        iM11831O2 = vd6.m11831O(parcel, i3);
                    } else if (c == 2) {
                        bArrM11850i = vd6.m11850i(parcel, i3);
                    } else if (c != 3) {
                        vd6.m11836T(parcel, i3);
                    } else {
                        iM11831O3 = vd6.m11831O(parcel, i3);
                    }
                }
                vd6.m11858q(parcel, iM11839W2);
                return new dy2(bArrM11850i, iM11831O2, iM11831O3);
            case 15:
                int iM11839W3 = vd6.m11839W(parcel);
                while (parcel.dataPosition() < iM11839W3) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 1) {
                        strM11853l2 = vd6.m11853l(parcel, i4);
                    } else if (c2 != 2) {
                        vd6.m11836T(parcel, i4);
                    } else {
                        iM11831O2 = vd6.m11831O(parcel, i4);
                    }
                }
                vd6.m11858q(parcel, iM11839W3);
                lr0 lr0Var = new lr0();
                lr0Var.f6971a = strM11853l2;
                lr0Var.f6972b = iM11831O2;
                VarHandle.storeStoreFence();
                return lr0Var;
            case 16:
                int iM11839W4 = vd6.m11839W(parcel);
                byte[] bArrM11850i2 = null;
                while (parcel.dataPosition() < iM11839W4) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 1) {
                        iM11831O2 = vd6.m11831O(parcel, i5);
                    } else if (c3 != 2) {
                        vd6.m11836T(parcel, i5);
                    } else {
                        bArrM11850i2 = vd6.m11850i(parcel, i5);
                    }
                }
                vd6.m11858q(parcel, iM11839W4);
                r01 r01Var = new r01();
                r01Var.f10517a = iM11831O2;
                r01Var.f10518b = null;
                r01Var.f10519c = bArrM11850i2;
                r01Var.m2064a();
                VarHandle.storeStoreFence();
                return r01Var;
            case 17:
                int iM11839W5 = vd6.m11839W(parcel);
                while (parcel.dataPosition() < iM11839W5) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 1) {
                        iM11831O2 = vd6.m11831O(parcel, i6);
                    } else if (c4 != 2) {
                        vd6.m11836T(parcel, i6);
                    } else {
                        strM11853l = vd6.m11853l(parcel, i6);
                    }
                }
                vd6.m11858q(parcel, iM11839W5);
                ba0 ba0Var = new ba0();
                ba0Var.f15186d = iM11831O2;
                ba0Var.f15187e = strM11853l;
                VarHandle.storeStoreFence();
                return ba0Var;
            case 18:
                int iM11839W6 = vd6.m11839W(parcel);
                while (parcel.dataPosition() < iM11839W6) {
                    int i7 = parcel.readInt();
                    char c5 = (char) i7;
                    if (c5 == 1) {
                        iM11831O2 = vd6.m11831O(parcel, i7);
                    } else if (c5 != 2) {
                        vd6.m11836T(parcel, i7);
                    } else {
                        arrayListM11855n = vd6.m11855n(parcel, i7, xs2.CREATOR);
                    }
                }
                vd6.m11858q(parcel, iM11839W6);
                return new ri4(arrayListM11855n, iM11831O2);
            case 19:
                int iM11839W7 = vd6.m11839W(parcel);
                int iM11831O4 = 0;
                while (parcel.dataPosition() < iM11839W7) {
                    int i8 = parcel.readInt();
                    char c6 = (char) i8;
                    if (c6 == 1) {
                        iM11831O2 = vd6.m11831O(parcel, i8);
                    } else if (c6 == 2) {
                        iM11831O4 = vd6.m11831O(parcel, i8);
                    } else if (c6 != 3) {
                        vd6.m11836T(parcel, i8);
                    } else {
                        intent = (Intent) vd6.m11852k(parcel, i8, Intent.CREATOR);
                    }
                }
                vd6.m11858q(parcel, iM11839W7);
                ml5 ml5Var = new ml5();
                ml5Var.f25007d = iM11831O2;
                ml5Var.f25008e = iM11831O4;
                ml5Var.f25009f = intent;
                VarHandle.storeStoreFence();
                return ml5Var;
            case 20:
                int iM11839W8 = vd6.m11839W(parcel);
                long jM11832P2 = 0;
                int iM11831O5 = 0;
                String strM11853l4 = null;
                String strM11853l5 = null;
                String strM11853l6 = null;
                String strM11853l7 = null;
                Uri uri = null;
                String strM11853l8 = null;
                String strM11853l9 = null;
                ArrayList arrayListM11855n2 = null;
                String strM11853l10 = null;
                String strM11853l11 = null;
                while (parcel.dataPosition() < iM11839W8) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            iM11831O5 = vd6.m11831O(parcel, i9);
                            break;
                        case 2:
                            strM11853l4 = vd6.m11853l(parcel, i9);
                            break;
                        case 3:
                            strM11853l5 = vd6.m11853l(parcel, i9);
                            break;
                        case 4:
                            strM11853l6 = vd6.m11853l(parcel, i9);
                            break;
                        case 5:
                            strM11853l7 = vd6.m11853l(parcel, i9);
                            break;
                        case 6:
                            uri = (Uri) vd6.m11852k(parcel, i9, Uri.CREATOR);
                            break;
                        case 7:
                            strM11853l8 = vd6.m11853l(parcel, i9);
                            break;
                        case '\b':
                            jM11832P2 = vd6.m11832P(parcel, i9);
                            break;
                        case '\t':
                            strM11853l9 = vd6.m11853l(parcel, i9);
                            break;
                        case '\n':
                            arrayListM11855n2 = vd6.m11855n(parcel, i9, Scope.CREATOR);
                            break;
                        case 11:
                            strM11853l10 = vd6.m11853l(parcel, i9);
                            break;
                        case '\f':
                            strM11853l11 = vd6.m11853l(parcel, i9);
                            break;
                        default:
                            vd6.m11836T(parcel, i9);
                            break;
                    }
                }
                vd6.m11858q(parcel, iM11839W8);
                return new GoogleSignInAccount(iM11831O5, strM11853l4, strM11853l5, strM11853l6, strM11853l7, uri, strM11853l8, jM11832P2, strM11853l9, arrayListM11855n2, strM11853l10, strM11853l11);
            case 21:
                int iM11839W9 = vd6.m11839W(parcel);
                ArrayList<String> arrayList = null;
                String strM11853l12 = null;
                while (parcel.dataPosition() < iM11839W9) {
                    int i10 = parcel.readInt();
                    char c7 = (char) i10;
                    if (c7 == 1) {
                        int iM11833Q = vd6.m11833Q(parcel, i10);
                        int iDataPosition = parcel.dataPosition();
                        if (iM11833Q == 0) {
                            arrayList = null;
                        } else {
                            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(iDataPosition + iM11833Q);
                            arrayList = arrayListCreateStringArrayList;
                        }
                    } else if (c7 != 2) {
                        vd6.m11836T(parcel, i10);
                    } else {
                        strM11853l12 = vd6.m11853l(parcel, i10);
                    }
                }
                vd6.m11858q(parcel, iM11839W9);
                cm5 cm5Var = new cm5();
                cm5Var.f16129d = arrayList;
                cm5Var.f16130e = strM11853l12;
                VarHandle.storeStoreFence();
                return cm5Var;
            case 22:
                int iM11839W10 = vd6.m11839W(parcel);
                lm5 lm5Var = null;
                while (parcel.dataPosition() < iM11839W10) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 1) {
                        iM11831O2 = vd6.m11831O(parcel, i11);
                    } else if (c8 == 2) {
                        lk0Var = (lk0) vd6.m11852k(parcel, i11, lk0.CREATOR);
                    } else if (c8 != 3) {
                        vd6.m11836T(parcel, i11);
                    } else {
                        lm5Var = (lm5) vd6.m11852k(parcel, i11, lm5.CREATOR);
                    }
                }
                vd6.m11858q(parcel, iM11839W10);
                return new gm5(iM11831O2, lk0Var, lm5Var);
            case 23:
                int iM11839W11 = vd6.m11839W(parcel);
                int iM11831O6 = -1;
                long jM11832P3 = 0;
                long jM11832P4 = 0;
                int iM11831O7 = 0;
                int iM11831O8 = 0;
                int iM11831O9 = 0;
                int iM11831O10 = 0;
                String strM11853l13 = null;
                String strM11853l14 = null;
                while (parcel.dataPosition() < iM11839W11) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            iM11831O7 = vd6.m11831O(parcel, i12);
                            break;
                        case 2:
                            iM11831O8 = vd6.m11831O(parcel, i12);
                            break;
                        case 3:
                            iM11831O9 = vd6.m11831O(parcel, i12);
                            break;
                        case 4:
                            jM11832P3 = vd6.m11832P(parcel, i12);
                            break;
                        case 5:
                            jM11832P4 = vd6.m11832P(parcel, i12);
                            break;
                        case 6:
                            strM11853l13 = vd6.m11853l(parcel, i12);
                            break;
                        case 7:
                            strM11853l14 = vd6.m11853l(parcel, i12);
                            break;
                        case '\b':
                            iM11831O10 = vd6.m11831O(parcel, i12);
                            break;
                        case '\t':
                            iM11831O6 = vd6.m11831O(parcel, i12);
                            break;
                        default:
                            vd6.m11836T(parcel, i12);
                            break;
                    }
                }
                vd6.m11858q(parcel, iM11839W11);
                return new xs2(iM11831O7, iM11831O8, iM11831O9, jM11832P3, jM11832P4, strM11853l13, strM11853l14, iM11831O10, iM11831O6);
            case 24:
                int iM11839W12 = vd6.m11839W(parcel);
                int iM11831O11 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iM11839W12) {
                    int i13 = parcel.readInt();
                    char c9 = (char) i13;
                    if (c9 == 1) {
                        iM11831O2 = vd6.m11831O(parcel, i13);
                    } else if (c9 == 2) {
                        account = (Account) vd6.m11852k(parcel, i13, Account.CREATOR);
                    } else if (c9 == 3) {
                        iM11831O11 = vd6.m11831O(parcel, i13);
                    } else if (c9 != 4) {
                        vd6.m11836T(parcel, i13);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) vd6.m11852k(parcel, i13, GoogleSignInAccount.CREATOR);
                    }
                }
                vd6.m11858q(parcel, iM11839W12);
                return new jm5(iM11831O2, account, iM11831O11, googleSignInAccount);
            case 25:
                int iM11839W13 = vd6.m11839W(parcel);
                boolean zM11829M = false;
                boolean zM11829M2 = false;
                lk0 lk0Var2 = null;
                while (parcel.dataPosition() < iM11839W13) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 1) {
                        iM11831O2 = vd6.m11831O(parcel, i14);
                    } else if (c10 == 2) {
                        iBinderM11830N = vd6.m11830N(parcel, i14);
                    } else if (c10 == 3) {
                        lk0Var2 = (lk0) vd6.m11852k(parcel, i14, lk0.CREATOR);
                    } else if (c10 == 4) {
                        zM11829M = vd6.m11829M(parcel, i14);
                    } else if (c10 != 5) {
                        vd6.m11836T(parcel, i14);
                    } else {
                        zM11829M2 = vd6.m11829M(parcel, i14);
                    }
                }
                vd6.m11858q(parcel, iM11839W13);
                lm5 lm5Var2 = new lm5();
                lm5Var2.f24181d = iM11831O2;
                lm5Var2.f24182e = iBinderM11830N;
                lm5Var2.f24183f = lk0Var2;
                lm5Var2.f24184g = zM11829M;
                lm5Var2.f24185h = zM11829M2;
                VarHandle.storeStoreFence();
                return lm5Var2;
            case 26:
                int iM11839W14 = vd6.m11839W(parcel);
                int iM11831O12 = 0;
                int iM11831O13 = 0;
                PendingIntent pendingIntent = null;
                String strM11853l15 = null;
                Integer numValueOf = null;
                while (parcel.dataPosition() < iM11839W14) {
                    int i15 = parcel.readInt();
                    char c11 = (char) i15;
                    if (c11 == 1) {
                        iM11831O12 = vd6.m11831O(parcel, i15);
                    } else if (c11 == 2) {
                        iM11831O13 = vd6.m11831O(parcel, i15);
                    } else if (c11 == 3) {
                        pendingIntent = (PendingIntent) vd6.m11852k(parcel, i15, PendingIntent.CREATOR);
                    } else if (c11 == 4) {
                        strM11853l15 = vd6.m11853l(parcel, i15);
                    } else if (c11 != 5) {
                        vd6.m11836T(parcel, i15);
                    } else {
                        int iM11833Q2 = vd6.m11833Q(parcel, i15);
                        if (iM11833Q2 == 0) {
                            numValueOf = null;
                        } else {
                            vd6.m11841Y(parcel, iM11833Q2, 4);
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                vd6.m11858q(parcel, iM11839W14);
                return new lk0(iM11831O12, iM11831O13, pendingIntent, strM11853l15, numValueOf);
            case 27:
                int iM11839W15 = vd6.m11839W(parcel);
                int iM11831O14 = 1000;
                int iM11831O15 = 1;
                while (parcel.dataPosition() < iM11839W15) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            iM11831O = vd6.m11831O(parcel, i16);
                            break;
                        case 2:
                            iM11831O15 = vd6.m11831O(parcel, i16);
                            break;
                        case 3:
                            jM11832P = vd6.m11832P(parcel, i16);
                            break;
                        case 4:
                            iM11831O14 = vd6.m11831O(parcel, i16);
                            break;
                        case 5:
                            np5VarArr = (np5[]) vd6.m11854m(parcel, i16, np5.CREATOR);
                            break;
                        case 6:
                            vd6.m11829M(parcel, i16);
                            break;
                        default:
                            vd6.m11836T(parcel, i16);
                            break;
                    }
                }
                vd6.m11858q(parcel, iM11839W15);
                LocationAvailability locationAvailability = new LocationAvailability();
                locationAvailability.f16235g = iM11831O14 >= 1000 ? 1000 : 0;
                locationAvailability.f16232d = iM11831O;
                locationAvailability.f16233e = iM11831O15;
                locationAvailability.f16234f = jM11832P;
                locationAvailability.f16236h = np5VarArr;
                VarHandle.storeStoreFence();
                return locationAvailability;
            default:
                int iM11839W16 = vd6.m11839W(parcel);
                WorkSource workSource = new WorkSource();
                long jM11832P5 = 0;
                long jM11832P6 = -1;
                float f = 0.0f;
                boolean zM11829M3 = false;
                int iM11831O16 = 0;
                int iM11831O17 = 0;
                boolean zM11829M4 = false;
                d16 d16Var = null;
                int iM11831O18 = Integer.MAX_VALUE;
                long jM11832P7 = Long.MAX_VALUE;
                long jM11832P8 = Long.MAX_VALUE;
                long jM11832P9 = 600000;
                long jM11832P10 = 3600000;
                int iM11831O19 = 102;
                while (parcel.dataPosition() < iM11839W16) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            iM11831O19 = vd6.m11831O(parcel, i17);
                            break;
                        case 2:
                            jM11832P10 = vd6.m11832P(parcel, i17);
                            break;
                        case 3:
                            jM11832P9 = vd6.m11832P(parcel, i17);
                            break;
                        case 4:
                        case 14:
                        default:
                            vd6.m11836T(parcel, i17);
                            break;
                        case 5:
                            jM11832P7 = vd6.m11832P(parcel, i17);
                            break;
                        case 6:
                            iM11831O18 = vd6.m11831O(parcel, i17);
                            break;
                        case 7:
                            vd6.m11840X(parcel, i17, 4);
                            f = parcel.readFloat();
                            break;
                        case '\b':
                            jM11832P5 = vd6.m11832P(parcel, i17);
                            break;
                        case '\t':
                            zM11829M3 = vd6.m11829M(parcel, i17);
                            break;
                        case '\n':
                            jM11832P8 = vd6.m11832P(parcel, i17);
                            break;
                        case 11:
                            jM11832P6 = vd6.m11832P(parcel, i17);
                            break;
                        case '\f':
                            iM11831O16 = vd6.m11831O(parcel, i17);
                            break;
                        case '\r':
                            iM11831O17 = vd6.m11831O(parcel, i17);
                            break;
                        case 15:
                            zM11829M4 = vd6.m11829M(parcel, i17);
                            break;
                        case 16:
                            workSource = (WorkSource) vd6.m11852k(parcel, i17, WorkSource.CREATOR);
                            break;
                        case 17:
                            d16Var = (d16) vd6.m11852k(parcel, i17, d16.CREATOR);
                            break;
                    }
                }
                vd6.m11858q(parcel, iM11839W16);
                return new LocationRequest(iM11831O19, jM11832P10, jM11832P9, jM11832P5, jM11832P7, jM11832P8, iM11831O18, f, zM11829M3, jM11832P6, iM11831O16, iM11831O17, zM11829M4, workSource, d16Var);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f33063a) {
            case 0:
                return new C1318x4[i];
            case 1:
                return new C0628ew[i];
            case 2:
                return new C0666fw[i];
            case 3:
                return new hw0[i];
            case 4:
                return new ao1[i];
            case 5:
                return new fo1[i];
            case 6:
                return new ko1[i];
            case 7:
                return new b62[i];
            case 8:
                return new gs2[i];
            case 9:
                return new ParcelImpl[i];
            case 10:
                return new z73[i];
            case 11:
                return new a83[i];
            case 12:
                return new b83[i];
            case 13:
                return new am0[i];
            case 14:
                return new dy2[i];
            case 15:
                return new lr0[i];
            case 16:
                return new r01[i];
            case 17:
                return new ba0[i];
            case 18:
                return new ri4[i];
            case 19:
                return new ml5[i];
            case 20:
                return new GoogleSignInAccount[i];
            case 21:
                return new cm5[i];
            case 22:
                return new gm5[i];
            case 23:
                return new xs2[i];
            case 24:
                return new jm5[i];
            case 25:
                return new lm5[i];
            case 26:
                return new lk0[i];
            case 27:
                return new LocationAvailability[i];
            default:
                return new LocationRequest[i];
        }
    }
}
