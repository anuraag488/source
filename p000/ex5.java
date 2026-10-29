package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ex5 extends pt5 implements gx5 {
    public static gx5 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof gx5 ? (gx5) iInterfaceQueryLocalInterface : new bx5(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", (byte) 6);
    }

    @Override // p000.pt5
    /* JADX INFO: renamed from: E */
    public final boolean mo2994E(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        qx5 jx5Var = null;
        dy5 xx5Var = null;
        qx5 jx5Var2 = null;
        qx5 jx5Var3 = null;
        qx5 jx5Var4 = null;
        qx5 jx5Var5 = null;
        az5 fy5Var = null;
        az5 fy5Var2 = null;
        az5 fy5Var3 = null;
        qx5 jx5Var6 = null;
        qx5 jx5Var7 = null;
        qx5 jx5Var8 = null;
        qx5 jx5Var9 = null;
        qx5 jx5Var10 = null;
        qx5 jx5Var11 = null;
        iz5 fz5Var = null;
        qx5 jx5Var12 = null;
        qx5 jx5Var13 = null;
        qx5 jx5Var14 = null;
        qx5 jx5Var15 = null;
        qx5 jx5Var16 = null;
        switch (i) {
            case 1:
                a02 a02VarM11709I = v23.m11709I(parcel.readStrongBinder());
                mz5 mz5Var = (mz5) st5.m10912a(parcel, mz5.CREATOR);
                long j = parcel.readLong();
                st5.m10915d(parcel);
                initialize(a02VarM11709I, mz5Var, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) st5.m10912a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolean z2 = parcel.readInt() != 0;
                long j2 = parcel.readLong();
                st5.m10915d(parcel);
                logEvent(string, string2, bundle, z, z2, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) st5.m10912a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    jx5Var = iInterfaceQueryLocalInterface instanceof qx5 ? (qx5) iInterfaceQueryLocalInterface : new jx5(strongBinder);
                }
                qx5 qx5Var = jx5Var;
                long j3 = parcel.readLong();
                st5.m10915d(parcel);
                logEventAndBundle(string3, string4, bundle2, qx5Var, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                a02 a02VarM11709I2 = v23.m11709I(parcel.readStrongBinder());
                ClassLoader classLoader = st5.f30558a;
                z = parcel.readInt() != 0;
                long j4 = parcel.readLong();
                st5.m10915d(parcel);
                setUserProperty(string5, string6, a02VarM11709I2, z, j4);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = st5.f30558a;
                z = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    jx5Var16 = iInterfaceQueryLocalInterface2 instanceof qx5 ? (qx5) iInterfaceQueryLocalInterface2 : new jx5(strongBinder2);
                }
                st5.m10915d(parcel);
                getUserProperties(string7, string8, z, jx5Var16);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    jx5Var15 = iInterfaceQueryLocalInterface3 instanceof qx5 ? (qx5) iInterfaceQueryLocalInterface3 : new jx5(strongBinder3);
                }
                st5.m10915d(parcel);
                getMaxUserProperties(string9, jx5Var15);
                break;
            case 7:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                st5.m10915d(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) st5.m10912a(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                st5.m10915d(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) st5.m10912a(parcel, Bundle.CREATOR);
                st5.m10915d(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    jx5Var14 = iInterfaceQueryLocalInterface4 instanceof qx5 ? (qx5) iInterfaceQueryLocalInterface4 : new jx5(strongBinder4);
                }
                st5.m10915d(parcel);
                getConditionalUserProperties(string13, string14, jx5Var14);
                break;
            case 11:
                ClassLoader classLoader3 = st5.f30558a;
                z = parcel.readInt() != 0;
                long j7 = parcel.readLong();
                st5.m10915d(parcel);
                setMeasurementEnabled(z, j7);
                break;
            case 12:
                long j8 = parcel.readLong();
                st5.m10915d(parcel);
                resetAnalyticsData(j8);
                break;
            case 13:
                long j9 = parcel.readLong();
                st5.m10915d(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                st5.m10915d(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                a02 a02VarM11709I3 = v23.m11709I(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                st5.m10915d(parcel);
                setCurrentScreen(a02VarM11709I3, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    jx5Var13 = iInterfaceQueryLocalInterface5 instanceof qx5 ? (qx5) iInterfaceQueryLocalInterface5 : new jx5(strongBinder5);
                }
                st5.m10915d(parcel);
                getCurrentScreenName(jx5Var13);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    jx5Var12 = iInterfaceQueryLocalInterface6 instanceof qx5 ? (qx5) iInterfaceQueryLocalInterface6 : new jx5(strongBinder6);
                }
                st5.m10915d(parcel);
                getCurrentScreenClass(jx5Var12);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    fz5Var = iInterfaceQueryLocalInterface7 instanceof iz5 ? (iz5) iInterfaceQueryLocalInterface7 : new fz5(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", (byte) 6);
                }
                st5.m10915d(parcel);
                setInstanceIdProvider(fz5Var);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    jx5Var11 = iInterfaceQueryLocalInterface8 instanceof qx5 ? (qx5) iInterfaceQueryLocalInterface8 : new jx5(strongBinder8);
                }
                st5.m10915d(parcel);
                getCachedAppInstanceId(jx5Var11);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    jx5Var10 = iInterfaceQueryLocalInterface9 instanceof qx5 ? (qx5) iInterfaceQueryLocalInterface9 : new jx5(strongBinder9);
                }
                st5.m10915d(parcel);
                getAppInstanceId(jx5Var10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    jx5Var9 = iInterfaceQueryLocalInterface10 instanceof qx5 ? (qx5) iInterfaceQueryLocalInterface10 : new jx5(strongBinder10);
                }
                st5.m10915d(parcel);
                getGmpAppId(jx5Var9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    jx5Var8 = iInterfaceQueryLocalInterface11 instanceof qx5 ? (qx5) iInterfaceQueryLocalInterface11 : new jx5(strongBinder11);
                }
                st5.m10915d(parcel);
                generateEventId(jx5Var8);
                break;
            case 23:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                st5.m10915d(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                st5.m10915d(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case 25:
                a02 a02VarM11709I4 = v23.m11709I(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                st5.m10915d(parcel);
                onActivityStarted(a02VarM11709I4, j14);
                break;
            case 26:
                a02 a02VarM11709I5 = v23.m11709I(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                st5.m10915d(parcel);
                onActivityStopped(a02VarM11709I5, j15);
                break;
            case 27:
                a02 a02VarM11709I6 = v23.m11709I(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) st5.m10912a(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                st5.m10915d(parcel);
                onActivityCreated(a02VarM11709I6, bundle5, j16);
                break;
            case 28:
                a02 a02VarM11709I7 = v23.m11709I(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                st5.m10915d(parcel);
                onActivityDestroyed(a02VarM11709I7, j17);
                break;
            case 29:
                a02 a02VarM11709I8 = v23.m11709I(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                st5.m10915d(parcel);
                onActivityPaused(a02VarM11709I8, j18);
                break;
            case 30:
                a02 a02VarM11709I9 = v23.m11709I(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                st5.m10915d(parcel);
                onActivityResumed(a02VarM11709I9, j19);
                break;
            case 31:
                a02 a02VarM11709I10 = v23.m11709I(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    jx5Var7 = iInterfaceQueryLocalInterface12 instanceof qx5 ? (qx5) iInterfaceQueryLocalInterface12 : new jx5(strongBinder12);
                }
                long j20 = parcel.readLong();
                st5.m10915d(parcel);
                onActivitySaveInstanceState(a02VarM11709I10, jx5Var7, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) st5.m10912a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    jx5Var6 = iInterfaceQueryLocalInterface13 instanceof qx5 ? (qx5) iInterfaceQueryLocalInterface13 : new jx5(strongBinder13);
                }
                long j21 = parcel.readLong();
                st5.m10915d(parcel);
                performAction(bundle6, jx5Var6, j21);
                break;
            case 33:
                int i2 = parcel.readInt();
                String string19 = parcel.readString();
                a02 a02VarM11709I11 = v23.m11709I(parcel.readStrongBinder());
                a02 a02VarM11709I12 = v23.m11709I(parcel.readStrongBinder());
                a02 a02VarM11709I13 = v23.m11709I(parcel.readStrongBinder());
                st5.m10915d(parcel);
                logHealthData(i2, string19, a02VarM11709I11, a02VarM11709I12, a02VarM11709I13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    fy5Var3 = iInterfaceQueryLocalInterface14 instanceof az5 ? (az5) iInterfaceQueryLocalInterface14 : new fy5(strongBinder14);
                }
                st5.m10915d(parcel);
                setEventInterceptor(fy5Var3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    fy5Var2 = iInterfaceQueryLocalInterface15 instanceof az5 ? (az5) iInterfaceQueryLocalInterface15 : new fy5(strongBinder15);
                }
                st5.m10915d(parcel);
                registerOnMeasurementEventListener(fy5Var2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    fy5Var = iInterfaceQueryLocalInterface16 instanceof az5 ? (az5) iInterfaceQueryLocalInterface16 : new fy5(strongBinder16);
                }
                st5.m10915d(parcel);
                unregisterOnMeasurementEventListener(fy5Var);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(st5.f30558a);
                st5.m10915d(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    jx5Var5 = iInterfaceQueryLocalInterface17 instanceof qx5 ? (qx5) iInterfaceQueryLocalInterface17 : new jx5(strongBinder17);
                }
                int i3 = parcel.readInt();
                st5.m10915d(parcel);
                getTestFlag(jx5Var5, i3);
                break;
            case 39:
                ClassLoader classLoader4 = st5.f30558a;
                z = parcel.readInt() != 0;
                st5.m10915d(parcel);
                setDataCollectionEnabled(z);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    jx5Var4 = iInterfaceQueryLocalInterface18 instanceof qx5 ? (qx5) iInterfaceQueryLocalInterface18 : new jx5(strongBinder18);
                }
                st5.m10915d(parcel);
                isDataCollectionEnabled(jx5Var4);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) st5.m10912a(parcel, Bundle.CREATOR);
                st5.m10915d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                st5.m10915d(parcel);
                clearMeasurementEnabled(j22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) st5.m10912a(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                st5.m10915d(parcel);
                setConsent(bundle8, j23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) st5.m10912a(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                st5.m10915d(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    jx5Var3 = iInterfaceQueryLocalInterface19 instanceof qx5 ? (qx5) iInterfaceQueryLocalInterface19 : new jx5(strongBinder19);
                }
                st5.m10915d(parcel);
                getSessionId(jx5Var3);
                break;
            case 48:
                Intent intent = (Intent) st5.m10912a(parcel, Intent.CREATOR);
                st5.m10915d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                pz5 pz5Var = (pz5) st5.m10912a(parcel, pz5.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j25 = parcel.readLong();
                st5.m10915d(parcel);
                setCurrentScreenByScionActivityInfo(pz5Var, string20, string21, j25);
                break;
            case 51:
                pz5 pz5Var2 = (pz5) st5.m10912a(parcel, pz5.CREATOR);
                long j26 = parcel.readLong();
                st5.m10915d(parcel);
                onActivityStartedByScionActivityInfo(pz5Var2, j26);
                break;
            case 52:
                pz5 pz5Var3 = (pz5) st5.m10912a(parcel, pz5.CREATOR);
                long j27 = parcel.readLong();
                st5.m10915d(parcel);
                onActivityStoppedByScionActivityInfo(pz5Var3, j27);
                break;
            case 53:
                pz5 pz5Var4 = (pz5) st5.m10912a(parcel, pz5.CREATOR);
                Bundle bundle10 = (Bundle) st5.m10912a(parcel, Bundle.CREATOR);
                long j28 = parcel.readLong();
                st5.m10915d(parcel);
                onActivityCreatedByScionActivityInfo(pz5Var4, bundle10, j28);
                break;
            case 54:
                pz5 pz5Var5 = (pz5) st5.m10912a(parcel, pz5.CREATOR);
                long j29 = parcel.readLong();
                st5.m10915d(parcel);
                onActivityDestroyedByScionActivityInfo(pz5Var5, j29);
                break;
            case 55:
                pz5 pz5Var6 = (pz5) st5.m10912a(parcel, pz5.CREATOR);
                long j30 = parcel.readLong();
                st5.m10915d(parcel);
                onActivityPausedByScionActivityInfo(pz5Var6, j30);
                break;
            case 56:
                pz5 pz5Var7 = (pz5) st5.m10912a(parcel, pz5.CREATOR);
                long j31 = parcel.readLong();
                st5.m10915d(parcel);
                onActivityResumedByScionActivityInfo(pz5Var7, j31);
                break;
            case 57:
                pz5 pz5Var8 = (pz5) st5.m10912a(parcel, pz5.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    jx5Var2 = iInterfaceQueryLocalInterface20 instanceof qx5 ? (qx5) iInterfaceQueryLocalInterface20 : new jx5(strongBinder20);
                }
                long j32 = parcel.readLong();
                st5.m10915d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(pz5Var8, jx5Var2, j32);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    xx5Var = iInterfaceQueryLocalInterface21 instanceof dy5 ? (dy5) iInterfaceQueryLocalInterface21 : new xx5(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", (byte) 6);
                }
                st5.m10915d(parcel);
                retrieveAndUploadBatches(xx5Var);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
