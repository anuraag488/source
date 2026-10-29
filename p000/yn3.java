package p000;

import ads_mobile_sdk.C0200km;
import android.app.Activity;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.CronetException;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.UrlResponseInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yn3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35359a;

    /* JADX INFO: renamed from: b */
    public Object f35360b;

    /* JADX INFO: renamed from: c */
    public Object f35361c;

    /* JADX INFO: renamed from: d */
    public Object f35362d;

    public /* synthetic */ yn3(byte b) {
        this.f35359a = b;
    }

    /* JADX INFO: renamed from: a */
    private final void m13182a() {
        dn6 dn6Var;
        qx5 qx5Var = (qx5) this.f35361c;
        oj6 oj6Var = (oj6) this.f35362d;
        oa6 oa6Var = (oa6) oj6Var.f36084a;
        String strMo5565D = null;
        try {
            try {
                s86 s86Var = oa6Var.f26513e;
                d76 d76Var = oa6Var.f26514f;
                oa6.m9014j(s86Var);
                if (s86Var.m10556B().m12660i(vc6.ANALYTICS_STORAGE)) {
                    s56 s56Var = oj6Var.f26789h;
                    if (s56Var != null) {
                        strMo5565D = s56Var.mo5565D((cp6) this.f35360b);
                        if (strMo5565D != null) {
                            mg6 mg6Var = oa6Var.f26521m;
                            oa6.m9015k(mg6Var);
                            mg6Var.f24902k.set(strMo5565D);
                            oa6.m9014j(s86Var);
                            s86Var.f29989k.m10507d(strMo5565D);
                        }
                        oj6Var.m9139I();
                        dn6Var = oa6Var.f26517i;
                        oa6.m9014j(dn6Var);
                        dn6Var.m4603c0(strMo5565D, qx5Var);
                    }
                    oa6.m9016l(d76Var);
                    d76Var.f16835j.m12504a("Failed to get app instance id");
                } else {
                    oa6.m9016l(d76Var);
                    d76Var.f16840o.m12504a("Analytics storage consent denied; will not get app instance id");
                    mg6 mg6Var2 = oa6Var.f26521m;
                    oa6.m9015k(mg6Var2);
                    mg6Var2.f24902k.set(null);
                    oa6.m9014j(s86Var);
                    s86Var.f29989k.m10507d(null);
                }
                dn6Var = oa6Var.f26517i;
            } catch (RemoteException e) {
                d76 d76Var2 = oa6Var.f26514f;
                oa6.m9016l(d76Var2);
                d76Var2.f16835j.m12505b(e, "Failed to get app instance id");
            }
            oa6.m9014j(dn6Var);
            dn6Var.m4603c0(strMo5565D, qx5Var);
        } catch (Throwable th) {
            dn6 dn6Var2 = oa6Var.f26517i;
            oa6.m9014j(dn6Var2);
            dn6Var2.m4603c0(null, qx5Var);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m13183b() {
        wp5 wp5Var = (wp5) this.f35360b;
        List<ny5> list = (List) this.f35361c;
        C0200km c0200km = (C0200km) this.f35362d;
        try {
            b86 b86Var = (b86) wp5Var.f33584b.f16551l;
            if (b86Var == null) {
                return;
            }
            String packageName = wp5Var.f33583a.getPackageName();
            ArrayList arrayList = new ArrayList();
            for (ny5 ny5Var : list) {
                String str = ny5Var.f26202a;
                arrayList.add(new if3(str, hz5.m6535d(str, ny5Var.f26203b, ny5Var.f26204c).toString(), ny5Var.f26205d));
            }
            lo5 lo5Var = new lo5(wp5Var, c0200km);
            k36 k36Var = (k36) b86Var;
            Parcel parcelM7550G = k36Var.m7550G();
            parcelM7550G.writeString(packageName);
            parcelM7550G.writeTypedList(arrayList);
            int i = av5.f14906a;
            parcelM7550G.writeStrongBinder(lo5Var);
            k36Var.m7552I(parcelM7550G, 1);
        } catch (DeadObjectException e) {
            Log.e("HsdpClientImpl", "hsdpService is dead", e);
        } catch (RemoteException e2) {
            Log.e("HsdpClientImpl", "Failed to call hsdpService.prewarm", e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x026f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0276  */
    /* JADX WARN: Code duplicated, block: B:105:0x0287  */
    /* JADX WARN: Code duplicated, block: B:107:0x028d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0293  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:115:0x0307 A[Catch: SQLiteException -> 0x0312, TRY_LEAVE, TryCatch #27 {SQLiteException -> 0x0312, blocks: (B:113:0x02e8, B:115:0x0307), top: B:320:0x02e8 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0336  */
    /* JADX WARN: Code duplicated, block: B:123:0x0338  */
    /* JADX WARN: Code duplicated, block: B:125:0x0340  */
    /* JADX WARN: Code duplicated, block: B:126:0x0356  */
    /* JADX WARN: Code duplicated, block: B:133:0x039f  */
    /* JADX WARN: Code duplicated, block: B:343:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Object objCall;
        JSONObject jSONObject;
        os5 os5Var;
        Cursor cursor;
        int i;
        um6 um6Var;
        long j;
        Cursor cursorQuery;
        um6 um6VarM3185X;
        String str;
        int i2;
        nm6 nm6Var;
        ar5 ar5Var;
        Long lValueOf;
        ContentValues contentValues;
        d76 d76Var;
        Cursor cursor2;
        AtomicReference atomicReference;
        byte b = 2;
        int i3 = 0;
        byte b2 = 3;
        switch (this.f35359a) {
            case 0:
                zn3 zn3Var = (zn3) this.f35362d;
                C0809js c0809js = (C0809js) this.f35360b;
                zn3Var.m13645b(c0809js, (li4) this.f35361c);
                ((AtomicInteger) zn3Var.f36207i.f25811c).set(0);
                double dMin = Math.min(3600000.0d, Math.pow(zn3Var.f36200b, zn3Var.m13644a()) * (60000.0d / zn3Var.f36199a));
                String str2 = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + c0809js.f22550b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str2, null);
                }
                try {
                    Thread.sleep((long) dMin);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            case 1:
                try {
                    objCall = ((nm1) this.f35360b).call();
                    break;
                } catch (Exception unused2) {
                    objCall = null;
                }
                mm1 mm1Var = (mm1) this.f35361c;
                Handler handler = (Handler) this.f35362d;
                ar1 ar1Var = new ar1(b2);
                ar1Var.f14798b = mm1Var;
                ar1Var.f14799c = objCall;
                VarHandle.storeStoreFence();
                handler.post(ar1Var);
                return;
            case 2:
                wp5 wp5Var = (wp5) this.f35360b;
                Bundle bundle = (Bundle) this.f35361c;
                lo5 lo5Var = (lo5) this.f35362d;
                try {
                    b86 b86Var = (b86) wp5Var.f33584b.f16551l;
                    if (b86Var == null) {
                        return;
                    }
                    k36 k36Var = (k36) b86Var;
                    Parcel parcelM7550G = k36Var.m7550G();
                    int i4 = av5.f14906a;
                    parcelM7550G.writeInt(1);
                    bundle.writeToParcel(parcelM7550G, 0);
                    parcelM7550G.writeStrongBinder(lo5Var);
                    k36Var.m7552I(parcelM7550G, 4);
                    return;
                } catch (DeadObjectException e) {
                    Log.e("HsdpClientImpl", "hsdpService is dead", e);
                    return;
                } catch (RemoteException e2) {
                    Log.e("HsdpClientImpl", "Failed to call hsdpService.endSession", e2);
                    return;
                }
            case 3:
                w06 w06Var = (w06) ((xq5) this.f35360b).f34539d.f20099b.mo4490f();
                String str3 = (String) this.f35361c;
                Activity activity = (Activity) this.f35362d;
                int iM7361c = k26.m7361c(activity);
                int iM7360b = k26.m7360b(activity);
                em6 em6Var = (em6) w06Var;
                Activity activity2 = em6Var.f18266b;
                String packageName = activity2.getPackageName();
                IBinder windowToken = activity2.getWindow().getDecorView().getWindowToken();
                if (windowToken == null) {
                    Log.e("HpoaClientImpl", "Window token is null, cannot show HPOA UI.");
                    return;
                } else {
                    em6Var.m5206a(str3, packageName, windowToken, iM7361c, iM7360b);
                    return;
                }
            case 4:
                C0927mz c0927mz = (C0927mz) this.f35360b;
                C0964nz c0964nz = (C0964nz) this.f35361c;
                C0973o7 c0973o7 = (C0973o7) this.f35362d;
                f00 f00Var = rz5.f29768k;
                c0927mz.m8450u(24, 4, f00Var);
                c0964nz.m8900b(f00Var, c0973o7.f26402b);
                return;
            case 5:
                String str4 = (String) this.f35360b;
                if (TextUtils.isEmpty(str4)) {
                    Log.d("UserMessagingPlatform", "Error on action: empty action name");
                    return;
                }
                String str5 = (String) this.f35361c;
                String lowerCase = str4.toLowerCase();
                if (TextUtils.isEmpty(str5)) {
                    jSONObject = new JSONObject();
                } else {
                    try {
                        jSONObject = new JSONObject(str5);
                    } catch (JSONException unused3) {
                        Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: failed to parse args: " + str5);
                        return;
                    }
                }
                wy5[] wy5VarArr = (wy5[]) this.f35362d;
                Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: " + jSONObject.toString());
                while (i3 < wy5VarArr.length) {
                    wy5 wy5Var = wy5VarArr[i3];
                    uo5 uo5Var = new uo5(b);
                    uo5Var.f32036b = wy5Var;
                    uo5Var.f32037c = lowerCase;
                    uo5Var.f32038d = jSONObject;
                    VarHandle.storeStoreFence();
                    FutureTask futureTask = new FutureTask(uo5Var);
                    wy5Var.mo12136f().execute(futureTask);
                    try {
                        if (((Boolean) futureTask.get()).booleanValue()) {
                            return;
                        } else {
                            i3++;
                        }
                    } catch (InterruptedException e3) {
                        Log.d("UserMessagingPlatform", "Thread interrupted for Action[" + lowerCase + "]: ", e3);
                    } catch (ExecutionException e4) {
                        Log.d("UserMessagingPlatform", zi4.m13621u("Failed to run Action[", lowerCase, "]: "), e4.getCause());
                    }
                }
                return;
            case 6:
                ry5.m10503a("Cronet JavaUploadDataSinkBase#executeOnUploadExecutor " + ((String) this.f35361c) + " running callback");
                zx5 zx5Var = (zx5) this.f35360b;
                j16 j16Var = (j16) this.f35362d;
                try {
                    i16 i16Var = ((u06) zx5Var).f31586m;
                    try {
                        j16Var.mo3680f();
                        break;
                    } catch (Throwable th) {
                        i16Var.getClass();
                        i16Var.m6557b(new gv5("Exception received from UploadDataProvider", th));
                        break;
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th2) {
                    try {
                        Trace.endSection();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            case 7:
                super/*mz*/.mo5435e((wd3) this.f35361c, (C1015oz) this.f35362d);
                return;
            case 8:
                super/*mz*/.mo5432b((C0973o7) this.f35361c, (C0964nz) this.f35362d);
                return;
            case 9:
                super/*mz*/.mo5431a((C0973o7) this.f35361c, (C0964nz) this.f35362d);
                return;
            case 10:
                i16 i16Var2 = (i16) this.f35360b;
                String str6 = (String) this.f35361c;
                m26 m26Var = (m26) this.f35362d;
                String string = URI.create(i16Var2.f21029m).resolve(str6).toString();
                i16Var2.f21032p = string;
                i16Var2.f21021e.add(string);
                oz5 oz5Var = new oz5((byte) 17);
                oz5Var.f27249b = i16Var2;
                oz5Var.f27250c = m26Var;
                VarHandle.storeStoreFence();
                i16Var2.m6560e(2, 3, oz5Var);
                return;
            case 11:
                r06 r06Var = (r06) this.f35360b;
                try {
                    r06Var.f28937a.onFailed(r06Var.f28940d, (UrlResponseInfo) this.f35361c, (CronetException) this.f35362d);
                    break;
                } catch (Exception e5) {
                    i16.m6556a(r06Var.f28940d, "onFailed", e5);
                }
                r06Var.m10178c();
                r06Var.f28940d.f21035s.f15870e.decrementAndGet();
                return;
            case 12:
                if (Thread.currentThread() == ((Thread) this.f35361c)) {
                    this.f35362d = new InlineExecutionProhibitedException();
                    return;
                } else {
                    ((Runnable) this.f35360b).run();
                    return;
                }
            case 13:
                Bundle bundle2 = (Bundle) this.f35361c;
                em6 em6Var2 = (em6) this.f35360b;
                ae6 ae6Var = (ae6) this.f35362d;
                try {
                    cw5 cw5Var = em6Var2.f18265a;
                    if (cw5Var == null) {
                        throw null;
                    }
                    ev5 ev5Var = (ev5) cw5Var.f16551l;
                    if (ev5Var == null) {
                        return;
                    }
                    vm5 vm5Var = (vm5) ev5Var;
                    Parcel parcelM7550G2 = vm5Var.m7550G();
                    int i5 = av5.f14906a;
                    parcelM7550G2.writeInt(1);
                    bundle2.writeToParcel(parcelM7550G2, 0);
                    parcelM7550G2.writeStrongBinder(ae6Var);
                    vm5Var.m7552I(parcelM7550G2, 1);
                    return;
                } catch (RemoteException e6) {
                    Log.e("HpoaClientImpl", "Failed to call hpoaService.startSession", e6);
                    return;
                }
            case 14:
                qm6 qm6Var = ((jc6) this.f35362d).f22167a;
                qm6Var.m9928A();
                yo5 yo5Var = (yo5) this.f35360b;
                Object objM12714f = yo5Var.f35434f.m12714f();
                cp6 cp6Var = (cp6) this.f35361c;
                if (objM12714f == null) {
                    qm6Var.m9945Y(yo5Var, cp6Var);
                    return;
                } else {
                    qm6Var.m9944X(yo5Var, cp6Var);
                    return;
                }
            case 15:
                ys5 ys5Var = (ys5) this.f35360b;
                cp6 cp6Var2 = (cp6) this.f35361c;
                qm6 qm6Var2 = ((jc6) this.f35362d).f22167a;
                if ("_cmp".equals(ys5Var.f35504d) && (os5Var = ys5Var.f35505e) != null) {
                    Bundle bundle3 = os5Var.f27065d;
                    if (bundle3.size() != 0) {
                        String string2 = bundle3.getString("_cis");
                        if ("referrer broadcast".equals(string2) || "referrer API".equals(string2)) {
                            qm6Var2.mo9019b().f16841p.m12505b(ys5Var.toString(), "Event has been filtered ");
                            ys5Var = new ys5("_cmpx", os5Var, ys5Var.f35506f, ys5Var.f35507g);
                        }
                    }
                }
                String str7 = ys5Var.f35504d;
                n96 n96Var = qm6Var2.f28591a;
                q76 q76Var = qm6Var2.f28597g;
                qm6.m9925S(n96Var);
                String str8 = cp6Var2.f16349d;
                pv5 pv5Var = TextUtils.isEmpty(str8) ? null : (pv5) n96Var.f25587n.m3648c(str8);
                if (pv5Var == null) {
                    qm6Var2.mo9019b().f16831L.m12505b(cp6Var2.f16349d, "EES not loaded for");
                    qm6Var2.m9928A();
                    qm6Var2.m9959j(ys5Var, cp6Var2);
                    return;
                }
                try {
                    tt2 tt2Var = pv5Var.f28038c;
                    qm6.m9925S(q76Var);
                    HashMap mapM9780n0 = q76.m9780n0(ys5Var.f35505e.m9261d(), true);
                    String strM6960c = iw5.m6960c(str7, vd6.f32545h, vd6.f32543f);
                    if (strM6960c == null) {
                        strM6960c = str7;
                    }
                    if (pv5Var.m9683a(new en5(strM6960c, ys5Var.f35507g, mapM9780n0))) {
                        if (((en5) tt2Var.f31429c).equals((en5) tt2Var.f31428b)) {
                            qm6Var2.m9928A();
                            qm6Var2.m9959j(ys5Var, cp6Var2);
                        } else {
                            qm6Var2.mo9019b().f16831L.m12505b(str7, "EES edited event");
                            qm6.m9925S(q76Var);
                            ys5 ys5VarM9781y = q76.m9781y((en5) tt2Var.f31429c);
                            qm6Var2.m9928A();
                            qm6Var2.m9959j(ys5VarM9781y, cp6Var2);
                        }
                        if (((ArrayList) tt2Var.f31430d).isEmpty()) {
                            return;
                        }
                        ArrayList arrayList = (ArrayList) tt2Var.f31430d;
                        int size = arrayList.size();
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            en5 en5Var = (en5) obj;
                            qm6Var2.mo9019b().f16831L.m12505b(en5Var.f18279a, "EES logging created event");
                            qm6.m9925S(q76Var);
                            ys5 ys5VarM9781y2 = q76.m9781y(en5Var);
                            qm6Var2.m9928A();
                            qm6Var2.m9959j(ys5VarM9781y2, cp6Var2);
                        }
                        return;
                    }
                } catch (xy5 unused4) {
                    qm6Var2.mo9019b().f16835j.m12506c("EES error. appId, eventName", cp6Var2.f16350e, str7);
                }
                qm6Var2.mo9019b().f16831L.m12505b(str7, "EES was not applied to event");
                qm6Var2.m9928A();
                qm6Var2.m9959j(ys5Var, cp6Var2);
                return;
            case 16:
                qm6 qm6Var3 = ((jc6) this.f35362d).f22167a;
                qm6Var3.m9928A();
                qm6Var3.m9955h((String) this.f35361c, (ys5) this.f35360b);
                return;
            case 17:
                qm6 qm6Var4 = ((jc6) this.f35362d).f22167a;
                qm6Var4.m9928A();
                xm6 xm6Var = (xm6) this.f35360b;
                Object objM12714f2 = xm6Var.m12714f();
                cp6 cp6Var3 = (cp6) this.f35361c;
                if (objM12714f2 == null) {
                    qm6Var4.m9942V(xm6Var.f34428e, cp6Var3);
                    return;
                } else {
                    qm6Var4.m9941U(xm6Var, cp6Var3);
                    return;
                }
            case 18:
                jc6 jc6Var = (jc6) this.f35360b;
                cp6 cp6Var4 = (cp6) this.f35361c;
                ko5 ko5Var = (ko5) this.f35362d;
                qm6 qm6Var5 = jc6Var.f22167a;
                qm6Var5.m9928A();
                String str9 = cp6Var4.f16349d;
                y42.m12854a0(str9);
                HashMap map = qm6Var5.f28585E;
                qm6Var5.mo9020c().mo5038t();
                qm6Var5.m9962k0();
                ar5 ar5Var2 = qm6Var5.f28593c;
                qm6.m9925S(ar5Var2);
                long j2 = ko5Var.f23294d;
                long j3 = ko5Var.f23296f;
                ar5Var2.mo5038t();
                ar5Var2.m10368u();
                try {
                    cursorQuery = ar5Var2.m3197l0().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j2)}, null, null, null, "1");
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string3 = cursorQuery.getString(1);
                                y42.m12854a0(string3);
                                try {
                                    try {
                                        try {
                                            um6Var = null;
                                            try {
                                                i = 4;
                                                try {
                                                    cursor2 = cursorQuery;
                                                    j = j3;
                                                    try {
                                                        um6VarM3185X = ar5Var2.m3185X(string3, j2, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                                                        cursor2.close();
                                                    } catch (SQLiteException e7) {
                                                        e = e7;
                                                        cursorQuery = cursor2;
                                                        try {
                                                            d76 d76Var2 = ((oa6) ar5Var2.f36084a).f26514f;
                                                            oa6.m9016l(d76Var2);
                                                            d76Var2.f16835j.m12506c("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j2), e);
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            um6VarM3185X = um6Var;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            cursor = cursorQuery;
                                                            if (cursor != null) {
                                                                cursor.close();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        cursor = cursor2;
                                                        if (cursor != null) {
                                                            cursor.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (SQLiteException e8) {
                                                    e = e8;
                                                    cursor2 = cursorQuery;
                                                    j = j3;
                                                    cursorQuery = cursor2;
                                                    d76 d76Var3 = ((oa6) ar5Var2.f36084a).f26514f;
                                                    oa6.m9016l(d76Var3);
                                                    d76Var3.f16835j.m12506c("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j2), e);
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    um6VarM3185X = um6Var;
                                                    if (um6VarM3185X == null) {
                                                        qm6Var5.mo9019b().f16838m.m12506c("[sgtm] Queued batch doesn't exist. appId, rowId", str9, Long.valueOf(j2));
                                                        return;
                                                    }
                                                    str = um6VarM3185X.f32000c;
                                                    i2 = ko5Var.f23295e;
                                                    if (i2 == 1) {
                                                        if (i2 == 3) {
                                                            nm6Var = (nm6) map.get(str);
                                                            if (nm6Var == null) {
                                                                nm6Var = new nm6();
                                                                nm6Var.f25950a = qm6Var5;
                                                                nm6Var.f25951b = 1;
                                                                nm6Var.f25952c = nm6Var.m8800a();
                                                                VarHandle.storeStoreFence();
                                                                map.put(str, nm6Var);
                                                            } else {
                                                                nm6Var.f25951b++;
                                                                nm6Var.f25952c = nm6Var.m8800a();
                                                            }
                                                            qm6Var5.mo9022e().getClass();
                                                            qm6Var5.mo9019b().f16831L.m12507d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str9, str, Long.valueOf((nm6Var.f25952c - System.currentTimeMillis()) / 1000));
                                                        }
                                                        ar5 ar5Var3 = qm6Var5.f28593c;
                                                        qm6.m9925S(ar5Var3);
                                                        Long lValueOf2 = Long.valueOf(ko5Var.f23294d);
                                                        ar5Var3.m3168G(lValueOf2);
                                                        qm6Var5.mo9019b().f16831L.m12506c("[sgtm] increased batch retry count after failed client upload. appId, rowId", str9, lValueOf2);
                                                        return;
                                                    }
                                                    if (map.containsKey(str)) {
                                                        map.remove(str);
                                                    }
                                                    ar5 ar5Var4 = qm6Var5.f28593c;
                                                    qm6.m9925S(ar5Var4);
                                                    Long lValueOf3 = Long.valueOf(j2);
                                                    ar5Var4.m3160B(lValueOf3);
                                                    qm6Var5.mo9019b().f16831L.m12506c("[sgtm] queued batch deleted after successful client upload. appId, rowId", str9, lValueOf3);
                                                    if (j > 0) {
                                                        ar5Var = qm6Var5.f28593c;
                                                        qm6.m9925S(ar5Var);
                                                        oa6 oa6Var = (oa6) ar5Var.f36084a;
                                                        ar5Var.mo5038t();
                                                        ar5Var.m10368u();
                                                        lValueOf = Long.valueOf(j);
                                                        contentValues = new ContentValues();
                                                        contentValues.put("upload_type", (Integer) 1);
                                                        ia5 ia5Var = oa6Var.f26519k;
                                                        d76Var = oa6Var.f26514f;
                                                        ia5Var.getClass();
                                                        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                                                        try {
                                                            if (ar5Var.m3197l0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str9, String.valueOf(i)}) != 1) {
                                                                oa6.m9016l(d76Var);
                                                                d76Var.f16838m.m12506c("Google Signal pending batch not updated. appId, rowId", str9, lValueOf);
                                                                break;
                                                            }
                                                            qm6Var5.mo9019b().f16831L.m12506c("[sgtm] queued Google Signal batch updated. appId, signalRowId", str9, Long.valueOf(j));
                                                            qm6Var5.m9976t(str9);
                                                            return;
                                                        } catch (SQLiteException e9) {
                                                            oa6.m9016l(d76Var);
                                                            d76Var.f16835j.m12507d("Failed to update google Signal pending batch. appid, rowId", str9, Long.valueOf(j), e9);
                                                            throw e9;
                                                        }
                                                    }
                                                    return;
                                                }
                                            } catch (SQLiteException e10) {
                                                e = e10;
                                                i = 4;
                                            }
                                        } catch (SQLiteException e11) {
                                            e = e11;
                                            i = 4;
                                            um6Var = null;
                                        }
                                    } catch (SQLiteException e12) {
                                        e = e12;
                                        i = 4;
                                        um6Var = null;
                                        cursor2 = cursorQuery;
                                        j = j3;
                                    }
                                } catch (SQLiteException e13) {
                                    e = e13;
                                    i = 4;
                                    um6Var = null;
                                    cursor2 = cursorQuery;
                                    j = j3;
                                }
                            } else {
                                i = 4;
                                um6Var = null;
                                j = j3;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                um6VarM3185X = um6Var;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            cursor2 = cursorQuery;
                        }
                    } catch (SQLiteException e14) {
                        e = e14;
                        i = 4;
                        um6Var = null;
                        cursor2 = cursorQuery;
                        j = j3;
                    }
                } catch (SQLiteException e15) {
                    e = e15;
                    i = 4;
                    um6Var = null;
                    j = j3;
                    cursorQuery = null;
                } catch (Throwable th7) {
                    th = th7;
                    cursor = null;
                }
                if (um6VarM3185X == null) {
                    qm6Var5.mo9019b().f16838m.m12506c("[sgtm] Queued batch doesn't exist. appId, rowId", str9, Long.valueOf(j2));
                    return;
                }
                str = um6VarM3185X.f32000c;
                i2 = ko5Var.f23295e;
                if (i2 == 1) {
                    if (i2 == 3) {
                        nm6Var = (nm6) map.get(str);
                        if (nm6Var == null) {
                            nm6Var = new nm6();
                            nm6Var.f25950a = qm6Var5;
                            nm6Var.f25951b = 1;
                            nm6Var.f25952c = nm6Var.m8800a();
                            VarHandle.storeStoreFence();
                            map.put(str, nm6Var);
                        } else {
                            nm6Var.f25951b++;
                            nm6Var.f25952c = nm6Var.m8800a();
                        }
                        qm6Var5.mo9022e().getClass();
                        qm6Var5.mo9019b().f16831L.m12507d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str9, str, Long.valueOf((nm6Var.f25952c - System.currentTimeMillis()) / 1000));
                    }
                    ar5 ar5Var5 = qm6Var5.f28593c;
                    qm6.m9925S(ar5Var5);
                    Long lValueOf4 = Long.valueOf(ko5Var.f23294d);
                    ar5Var5.m3168G(lValueOf4);
                    qm6Var5.mo9019b().f16831L.m12506c("[sgtm] increased batch retry count after failed client upload. appId, rowId", str9, lValueOf4);
                    return;
                }
                if (map.containsKey(str)) {
                    map.remove(str);
                }
                ar5 ar5Var6 = qm6Var5.f28593c;
                qm6.m9925S(ar5Var6);
                Long lValueOf5 = Long.valueOf(j2);
                ar5Var6.m3160B(lValueOf5);
                qm6Var5.mo9019b().f16831L.m12506c("[sgtm] queued batch deleted after successful client upload. appId, rowId", str9, lValueOf5);
                if (j > 0) {
                    ar5Var = qm6Var5.f28593c;
                    qm6.m9925S(ar5Var);
                    oa6 oa6Var2 = (oa6) ar5Var.f36084a;
                    ar5Var.mo5038t();
                    ar5Var.m10368u();
                    lValueOf = Long.valueOf(j);
                    contentValues = new ContentValues();
                    contentValues.put("upload_type", (Integer) 1);
                    ia5 ia5Var2 = oa6Var2.f26519k;
                    d76Var = oa6Var2.f26514f;
                    ia5Var2.getClass();
                    contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                    if (ar5Var.m3197l0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str9, String.valueOf(i)}) != 1) {
                        oa6.m9016l(d76Var);
                        d76Var.f16838m.m12506c("Google Signal pending batch not updated. appId, rowId", str9, lValueOf);
                        break;
                    }
                    qm6Var5.mo9019b().f16831L.m12506c("[sgtm] queued Google Signal batch updated. appId, signalRowId", str9, Long.valueOf(j));
                    qm6Var5.m9976t(str9);
                    return;
                }
                return;
            case 19:
                AtomicReference atomicReference2 = (AtomicReference) this.f35360b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            oj6 oj6Var = (oj6) this.f35362d;
                            oa6 oa6Var3 = (oa6) oj6Var.f36084a;
                            s86 s86Var = oa6Var3.f26513e;
                            oa6.m9014j(s86Var);
                            if (s86Var.m10556B().m12660i(vc6.ANALYTICS_STORAGE)) {
                                s56 s56Var = oj6Var.f26789h;
                                if (s56Var != null) {
                                    atomicReference2.set(s56Var.mo5565D((cp6) this.f35361c));
                                    String str10 = (String) atomicReference2.get();
                                    if (str10 != null) {
                                        mg6 mg6Var = ((oa6) oj6Var.f36084a).f26521m;
                                        oa6.m9015k(mg6Var);
                                        mg6Var.f24902k.set(str10);
                                        s86 s86Var2 = oa6Var3.f26513e;
                                        oa6.m9014j(s86Var2);
                                        s86Var2.f29989k.m10507d(str10);
                                    }
                                    oj6Var.m9139I();
                                    atomicReference = (AtomicReference) this.f35360b;
                                    atomicReference.notify();
                                    return;
                                }
                                d76 d76Var4 = oa6Var3.f26514f;
                                oa6.m9016l(d76Var4);
                                d76Var4.f16835j.m12504a("Failed to get app instance id");
                            } else {
                                d76 d76Var5 = oa6Var3.f26514f;
                                oa6.m9016l(d76Var5);
                                d76Var5.f16840o.m12504a("Analytics storage consent denied; will not get app instance id");
                                mg6 mg6Var2 = ((oa6) oj6Var.f36084a).f26521m;
                                oa6.m9015k(mg6Var2);
                                mg6Var2.f24902k.set(null);
                                s86 s86Var3 = oa6Var3.f26513e;
                                oa6.m9014j(s86Var3);
                                s86Var3.f29989k.m10507d(null);
                                atomicReference2.set(null);
                            }
                            atomicReference2.notify();
                            return;
                        } catch (RemoteException e16) {
                            d76 d76Var6 = ((oa6) ((oj6) this.f35362d).f36084a).f26514f;
                            oa6.m9016l(d76Var6);
                            d76Var6.f16835j.m12505b(e16, "Failed to get app instance id");
                            atomicReference = (AtomicReference) this.f35360b;
                        }
                    } catch (Throwable th8) {
                        ((AtomicReference) this.f35360b).notify();
                        throw th8;
                    }
                }
                break;
            case 20:
                m13182a();
                return;
            case 21:
                oj6 oj6Var2 = (oj6) this.f35360b;
                cp6 cp6Var5 = (cp6) this.f35361c;
                ko5 ko5Var2 = (ko5) this.f35362d;
                oa6 oa6Var4 = (oa6) oj6Var2.f36084a;
                s56 s56Var2 = oj6Var2.f26789h;
                if (s56Var2 == null) {
                    d76 d76Var7 = oa6Var4.f26514f;
                    oa6.m9016l(d76Var7);
                    d76Var7.f16835j.m12504a("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    s56Var2.mo5569f(cp6Var5, ko5Var2);
                    oj6Var2.m9139I();
                    return;
                } catch (RemoteException e17) {
                    d76 d76Var8 = oa6Var4.f26514f;
                    oa6.m9016l(d76Var8);
                    d76Var8.f16835j.m12506c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(ko5Var2.f23294d), e17);
                    return;
                }
            case 22:
                bt5 bt5Var = (bt5) this.f35360b;
                d76 d76Var9 = (d76) this.f35361c;
                JobParameters jobParameters = (JobParameters) this.f35362d;
                d76Var9.f16831L.m12504a("AppMeasurementJobService processed last upload request.");
                ((uj6) ((Service) bt5Var.f15596b)).mo4065c(jobParameters);
                return;
            case 23:
                m13183b();
                return;
            default:
                wo5 wo5Var = (wo5) this.f35360b;
                cl0 cl0Var = (cl0) this.f35361c;
                e00 e00Var = (e00) this.f35362d;
                Objects.requireNonNull(cl0Var);
                fk6 fk6Var = new fk6(b2);
                fk6Var.f19064b = cl0Var;
                VarHandle.storeStoreFence();
                ((Handler) wo5Var.f33567b).post(fk6Var);
                if (e00Var.f17553b != 2) {
                    ((gu5) wo5Var.f33570e).m6172a();
                    return;
                }
                return;
        }
    }
}
