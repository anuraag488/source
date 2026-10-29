package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ar3 implements cl0, gi4, InterfaceC1027pa, w20, dd3, le4, InterfaceC0976oa, m81, q72, ai3 {

    /* JADX INFO: renamed from: c */
    public static ar3 f14805c;

    /* JADX INFO: renamed from: d */
    public static final br3 f14806d = new br3(0, 0, 0, false, false);

    /* JADX INFO: renamed from: e */
    public static final ar3 f14807e;

    /* JADX INFO: renamed from: f */
    public static final Object f14808f;

    /* JADX INFO: renamed from: g */
    public static volatile ar3 f14809g;

    /* JADX INFO: renamed from: h */
    public static final or1 f14810h;

    /* JADX INFO: renamed from: i */
    public static final pj5 f14811i;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f14812a;

    /* JADX INFO: renamed from: b */
    public Object f14813b;

    static {
        byte b = 1;
        ar3 ar3Var = new ar3(b);
        ar3Var.f14813b = new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f};
        VarHandle.storeStoreFence();
        f14807e = ar3Var;
        f14808f = new Object();
        f14810h = new or1(b);
        f14811i = new pj5((byte) 28);
    }

    public ar3(int i, long j) {
        this.f14812a = (byte) 16;
        pi4 pi4Var = pi4.f27637h;
        p31 p31Var = new p31();
        p31Var.f27336a = i;
        p31Var.f27337b = TimeUnit.MINUTES.toNanos(j);
        p31Var.f27338c = pi4Var.m9535d();
        p31Var.f27339d = new my1(p31Var, zi4.m13623w(new StringBuilder(), zv4.f36421g, " ConnectionPool"));
        p31Var.f27340e = new ConcurrentLinkedQueue();
        if (j <= 0) {
            C1077qn.m9988n(zi4.m13619s("keepAliveDuration <= 0: ", j));
            throw null;
        }
        VarHandle.storeStoreFence();
        this.f14813b = p31Var;
    }

    /* JADX INFO: renamed from: r */
    public static synchronized ar3 m3127r() {
        ar3 ar3Var;
        ar3Var = f14805c;
        if (ar3Var == null) {
            ar3Var = new ar3((byte) 0);
            f14805c = ar3Var;
        }
        return ar3Var;
    }

    /* JADX INFO: renamed from: s */
    public static ar3 m3128s() {
        if (f14809g == null) {
            synchronized (f14808f) {
                try {
                    if (f14809g == null) {
                        ar3 ar3Var = new ar3((byte) 2);
                        ar3Var.f14813b = new ConcurrentHashMap();
                        VarHandle.storeStoreFence();
                        f14809g = ar3Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ar3 ar3Var2 = f14809g;
        y42.m12854a0(ar3Var2);
        return ar3Var2;
    }

    /* JADX INFO: renamed from: z */
    public static String m3129z(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: A */
    public void m3130A(float f, float f2) {
        ((jp0) this.f14813b).m7248w().mo6249e(f, f2);
    }

    /* JADX INFO: renamed from: B */
    public void m3131B(Context context, ServiceConnection serviceConnection) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f14813b;
        if ((serviceConnection instanceof mk6) || !concurrentHashMap.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                concurrentHashMap.remove(serviceConnection);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public void m3132C(int i, Object obj, fw3 fw3Var) {
        ya0 ya0Var = (ya0) this.f14813b;
        ya0Var.m13075u(i, 3);
        fw3Var.mo5832e((AbstractC1240v1) obj, ya0Var.f35064a);
        ya0Var.m13075u(i, 4);
    }

    /* JADX INFO: renamed from: D */
    public void m3133D(int i, Object obj, fw3 fw3Var) {
        AbstractC1240v1 abstractC1240v1 = (AbstractC1240v1) obj;
        ya0 ya0Var = (ya0) this.f14813b;
        ya0Var.m13075u(i, 2);
        ya0Var.m13077w(abstractC1240v1.mo11101b(fw3Var));
        fw3Var.mo5832e(abstractC1240v1, this);
    }

    /* JADX INFO: renamed from: E */
    public boolean m3134E(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f14813b;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((r35.m10189a(context).m12997a(0, packageName).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof mk6) {
            if (executor == null) {
                executor = null;
            }
            return executor != null ? context.bindService(intent, i, executor, serviceConnection) : context.bindService(intent, serviceConnection, i);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = executor != null ? context.bindService(intent, i, executor, serviceConnection) : context.bindService(intent, serviceConnection, i);
            if (zBindService) {
                return zBindService;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }

    @Override // p000.q72
    /* JADX INFO: renamed from: b */
    public boolean mo3135b() {
        return false;
    }

    @Override // p000.dd3
    /* JADX INFO: renamed from: c */
    public long mo3100c(s52 s52Var, long j, df2 df2Var, long j2) {
        long j3 = ((o52) ((wp1) this.f14813b).invoke()).f26352a;
        int iM13889x = zy5.m13889x(s52Var.f29916a + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), df2Var == df2.f17011a);
        return (((long) zy5.m13889x(s52Var.f29917b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) iM13889x) << 32);
    }

    @Override // p000.q72
    /* JADX INFO: renamed from: e */
    public zl2 mo3137e(String str) {
        C1040pn c1040pn = new C1040pn((byte) 11);
        c1040pn.f27754b = this;
        VarHandle.storeStoreFence();
        return AbstractC0647fd.m5686z(c1040pn);
    }

    @Override // p000.w20
    /* JADX INFO: renamed from: f */
    public void mo3138f(op0 op0Var) {
        this.f14813b = op0Var;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // p000.m81
    /* JADX INFO: renamed from: g */
    public Object mo3139g(String str) {
        return ((w81) this.f14813b).mo5607d(str, null);
    }

    @Override // p000.ai3
    public Object get() {
        return wv1.m12423m(new t31(C1035pi.f27625w), null, new eh1((Context) ((v42) this.f14813b).f32392a, (byte) 0), 6);
    }

    @Override // p000.InterfaceC1027pa
    /* JADX INFO: renamed from: h */
    public void mo3140h(String str, Bundle bundle) {
        op0 op0Var = (op0) this.f14813b;
        if (op0Var != null) {
            try {
                String str2 = "$A$:" + m3129z(str, bundle);
                rp0 rp0Var = op0Var.f26933a;
                rp0Var.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() - rp0Var.f29498d;
                yq0 yq0Var = (yq0) rp0Var.f29509o.f22481b;
                pp0 pp0Var = new pp0((byte) 0);
                pp0Var.f27876b = rp0Var;
                pp0Var.f27877c = jCurrentTimeMillis;
                pp0Var.f27878d = str2;
                VarHandle.storeStoreFence();
                yq0Var.m13214a(pp0Var);
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // p000.cl0
    /* JADX INFO: renamed from: i */
    public void mo3141i() {
        ((b70) this.f14813b).resumeWith(Boolean.TRUE);
    }

    @Override // p000.q72
    /* JADX INFO: renamed from: j */
    public void mo3142j(Executor executor, i85 i85Var) {
        RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 10);
        runnableC1285w9.f33164b = this;
        runnableC1285w9.f33165c = i85Var;
        VarHandle.storeStoreFence();
        executor.execute(runnableC1285w9);
    }

    @Override // p000.InterfaceC0976oa
    /* JADX INFO: renamed from: k */
    public void mo3143k(Bundle bundle) {
        ((C0865la) ((InterfaceC0828ka) this.f14813b)).m7883a("clx", "_ae", bundle);
    }

    /* JADX INFO: renamed from: l */
    public void m3144l(wf2 wf2Var) {
        if (!wf2Var.m12256J()) {
            q32.m9721c("DepthSortedSet.add called on an unattached node");
        }
        ((ha4) this.f14813b).add(wf2Var);
    }

    /* JADX INFO: renamed from: m */
    public void m3145m() {
        ((ui0) this.f14813b).getClass();
    }

    @Override // p000.le4
    /* JADX INFO: renamed from: n */
    public nr6 mo3146n(Object obj) {
        c44 c44Var = (c44) obj;
        np0 np0Var = ((lp0) this.f14813b).f24261e;
        if (c44Var == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return y62.m12936B(null);
        }
        ip0 ip0Var = np0.f25991r;
        return y62.m12976j0(Arrays.asList(np0Var.m8813g(), np0Var.f26005m.m4954r(null, (yq0) np0Var.f25997e.f22481b)));
    }

    /* JADX INFO: renamed from: o */
    public void m3147o(byte b) {
        ((Parcel) this.f14813b).writeByte(b);
    }

    /* JADX INFO: renamed from: p */
    public void m3148p(float f) {
        ((Parcel) this.f14813b).writeFloat(f);
    }

    /* JADX INFO: renamed from: q */
    public void m3149q(long j) {
        long jM3633c = bm4.m3633c(j);
        byte b = 0;
        if (!cm4.m4048b(jM3633c, 0L)) {
            if (cm4.m4048b(jM3633c, 4294967296L)) {
                b = 1;
            } else if (cm4.m4048b(jM3633c, 8589934592L)) {
                b = 2;
            }
        }
        m3147o(b);
        if (cm4.m4048b(bm4.m3633c(j), 0L)) {
            return;
        }
        m3148p(bm4.m3634d(j));
    }

    /* JADX INFO: renamed from: t */
    public void m3150t(float f, float f2, float f3, float f4) {
        jp0 jp0Var = (jp0) this.f14813b;
        h70 h70VarM7248w = jp0Var.m7248w();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jp0Var.m7219E() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jp0Var.m7219E() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            p32.m9361a("Width and height must be greater than or equal to zero");
        }
        jp0Var.m7230T(jFloatToRawIntBits);
        h70VarM7248w.mo6249e(f, f2);
    }

    public String toString() {
        switch (this.f14812a) {
            case 1:
                return "Bradford";
            case 22:
                return ((ha4) this.f14813b).toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m3151u(Object obj, Object... objArr) {
        List listAsList = Arrays.asList(objArr);
        ye0 ye0Var = (ye0) this.f14813b;
        if (obj == null) {
            StringBuilder sb = new StringBuilder("null key in entry: null=");
            Iterator it = listAsList.iterator();
            StringBuilder sb2 = new StringBuilder("[");
            boolean z = true;
            while (it.hasNext()) {
                if (!z) {
                    sb2.append(", ");
                }
                sb2.append(it.next());
                z = false;
            }
            sb2.append(']');
            sb.append(sb2.toString());
            throw new NullPointerException(sb.toString());
        }
        Collection collection = (Collection) ye0Var.get(obj);
        if (collection != null) {
            for (Object obj2 : listAsList) {
                y70.m13034n(obj, obj2);
                collection.add(obj2);
            }
            return;
        }
        Iterator it2 = listAsList.iterator();
        if (it2.hasNext()) {
            af0 af0VarM2953a = af0.m2953a();
            while (it2.hasNext()) {
                Object next = it2.next();
                y70.m13034n(obj, next);
                af0VarM2953a.add(next);
            }
            ye0Var.put(obj, af0VarM2953a);
        }
    }

    /* JADX INFO: renamed from: v */
    public JSONObject m3152v() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f14813b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(se0.m10714b0(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        se0.m10731l(fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                    se0.m10731l(fileInputStream, "Error while closing settings cache file.");
                    return null;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            se0.m10731l(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            se0.m10731l(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* JADX INFO: renamed from: w */
    public boolean m3153w(wf2 wf2Var) {
        if (!wf2Var.m12256J()) {
            q32.m9721c("DepthSortedSet.remove called on an unattached node");
        }
        return ((ha4) this.f14813b).remove(wf2Var);
    }

    /* JADX INFO: renamed from: x */
    public void m3154x(long j, float f) {
        h70 h70VarM7248w = ((jp0) this.f14813b).m7248w();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        h70VarM7248w.mo6249e(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        h70VarM7248w.mo6246b(f);
        h70VarM7248w.mo6249e(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    /* JADX INFO: renamed from: y */
    public void m3155y(float f, float f2, long j) {
        h70 h70VarM7248w = ((jp0) this.f14813b).m7248w();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        h70VarM7248w.mo6249e(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        h70VarM7248w.mo6245a(f, f2);
        h70VarM7248w.mo6249e(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public /* synthetic */ ar3(byte b) {
        this.f14812a = b;
    }

    public ar3() {
        this.f14812a = (byte) 22;
        this.f14813b = new ha4(as4.f14843b);
    }

    public ar3(vi4 vi4Var) {
        this.f14812a = (byte) 26;
        this.f14813b = vi4Var;
    }

    @Override // p000.q72
    public void close() {
    }

    @Override // p000.q72
    /* JADX INFO: renamed from: d */
    public void mo3136d(Executor executor, C1163sz c1163sz) {
    }
}
