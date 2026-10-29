package p000;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.lang.invoke.VarHandle;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hg1 {

    /* JADX INFO: renamed from: k */
    public static final Object f20543k = new Object();

    /* JADX INFO: renamed from: l */
    public static final C0805jo f20544l = new C0805jo(0);

    /* JADX INFO: renamed from: a */
    public final Context f20545a;

    /* JADX INFO: renamed from: b */
    public final String f20546b;

    /* JADX INFO: renamed from: c */
    public final ug1 f20547c;

    /* JADX INFO: renamed from: d */
    public final lg0 f20548d;

    /* JADX INFO: renamed from: g */
    public final qg2 f20551g;

    /* JADX INFO: renamed from: h */
    public final bi3 f20552h;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f20549e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f20550f = new AtomicBoolean();

    /* JADX INFO: renamed from: i */
    public final CopyOnWriteArrayList f20553i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j */
    public final CopyOnWriteArrayList f20554j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public hg1(Context context, String str, ug1 ug1Var) {
        ?? arrayList;
        int i = 0;
        ?? r1 = 0;
        ?? r2 = 0;
        this.f20545a = context;
        y42.m12851X(str);
        this.f20546b = str;
        this.f20547c = ug1Var;
        C1344xu c1344xu = ng1.f25769a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        for (String str3 : arrayList) {
            fg0 fg0Var = new fg0(r2 == true ? 1 : 0);
            fg0Var.f18956b = str3;
            VarHandle.storeStoreFence();
            arrayList2.add(fg0Var);
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        ht4 ht4Var = ht4.f20850a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
        byte b = 1;
        fg0 fg0Var2 = new fg0(b);
        fg0Var2.f18956b = firebaseCommonRegistrar;
        VarHandle.storeStoreFence();
        arrayList3.add(fg0Var2);
        ExecutorsRegistrar executorsRegistrar = new ExecutorsRegistrar();
        fg0 fg0Var3 = new fg0(b);
        fg0Var3.f18956b = executorsRegistrar;
        VarHandle.storeStoreFence();
        arrayList3.add(fg0Var3);
        arrayList4.add(qf0.m9882d(context, Context.class, new Class[0]));
        arrayList4.add(qf0.m9882d(this, hg1.class, new Class[0]));
        arrayList4.add(qf0.m9882d(ug1Var, ug1.class, new Class[0]));
        byte b2 = 2;
        h50 h50Var = new h50(b2);
        if (lb5.m7908Q(context) && ng1.f25770b.get()) {
            arrayList4.add(qf0.m9882d(c1344xu, C1344xu.class, new Class[0]));
        }
        lg0 lg0Var = new lg0();
        lg0Var.f24016a = new HashMap();
        lg0Var.f24017b = new HashMap();
        lg0Var.f24018c = new HashMap();
        lg0Var.f24019d = new HashSet();
        lg0Var.f24021f = new AtomicReference();
        wa1 wa1Var = new wa1();
        wa1Var.f33190a = new HashMap();
        wa1Var.f33191b = new ArrayDeque();
        VarHandle.storeStoreFence();
        lg0Var.f24020e = wa1Var;
        lg0Var.f24022g = h50Var;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(qf0.m9882d(wa1Var, wa1.class, ie4.class, ii3.class));
        arrayList5.add(qf0.m9882d(lg0Var, lg0.class, new Class[0]));
        int size = arrayList4.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList4.get(i2);
            i2++;
            qf0 qf0Var = (qf0) obj;
            if (qf0Var != null) {
                arrayList5.add(qf0Var);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList3.get(i3);
            i3++;
            arrayList6.add(obj2);
        }
        ArrayList arrayList7 = new ArrayList();
        synchronized (lg0Var) {
            Iterator it = arrayList6.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((bi3) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList5.addAll(((h50) lg0Var.f24022g).m6230D(componentRegistrar));
                        it.remove();
                    }
                } catch (j72 e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                for (Object obj3 : ((qf0) it2.next()).f28429b.toArray()) {
                    if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (((HashSet) lg0Var.f24019d).contains(obj3.toString())) {
                            it2.remove();
                            break;
                        }
                        ((HashSet) lg0Var.f24019d).add(obj3.toString());
                    }
                }
            }
            if (((HashMap) lg0Var.f24016a).isEmpty()) {
                sj3.m10826v(arrayList5);
            } else {
                ArrayList arrayList8 = new ArrayList(((HashMap) lg0Var.f24016a).keySet());
                arrayList8.addAll(arrayList5);
                sj3.m10826v(arrayList8);
            }
            int size3 = arrayList5.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj4 = arrayList5.get(i4);
                i4++;
                qf0 qf0Var2 = (qf0) obj4;
                kg0 kg0Var = new kg0(r1 == true ? 1 : 0);
                kg0Var.f23104b = lg0Var;
                kg0Var.f23105c = qf0Var2;
                VarHandle.storeStoreFence();
                ((HashMap) lg0Var.f24016a).put(qf0Var2, new qg2(kg0Var));
            }
            arrayList7.addAll(lg0Var.m7965l(arrayList5));
            arrayList7.addAll(lg0Var.m7966m());
            lg0Var.m7964k();
        }
        int size4 = arrayList7.size();
        while (i < size4) {
            Object obj5 = arrayList7.get(i);
            i++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) lg0Var.f24021f).get();
        if (bool != null) {
            lg0Var.m7963i((HashMap) lg0Var.f24016a, bool.booleanValue());
        }
        VarHandle.storeStoreFence();
        this.f20548d = lg0Var;
        Trace.endSection();
        kg0 kg0Var2 = new kg0(b2);
        kg0Var2.f23104b = this;
        kg0Var2.f23105c = context;
        VarHandle.storeStoreFence();
        this.f20551g = new qg2(kg0Var2);
        this.f20552h = lg0Var.mo4020d(ew0.class);
        eg1 eg1Var = new eg1();
        eg1Var.f18067a = this;
        VarHandle.storeStoreFence();
        m6388a();
        if (this.f20549e.get()) {
            ComponentCallbacks2C0776iw.f21830e.f21831a.get();
        }
        this.f20553i.add(eg1Var);
        Trace.endSection();
    }

    /* JADX INFO: renamed from: c */
    public static hg1 m6386c() {
        hg1 hg1Var;
        synchronized (f20543k) {
            try {
                hg1Var = (hg1) f20544l.get("[DEFAULT]");
                if (hg1Var == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C0638f5.m5551v() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((ew0) hg1Var.f20552h.get()).m5409b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return hg1Var;
    }

    /* JADX INFO: renamed from: f */
    public static hg1 m6387f(Context context, ug1 ug1Var) {
        hg1 hg1Var;
        AtomicReference atomicReference = fg1.f18957a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = fg1.f18957a;
            if (atomicReference2.get() == null) {
                fg1 fg1Var = new fg1();
                if (atomicReference2.compareAndSet(null, fg1Var)) {
                    ComponentCallbacks2C0776iw.m6949b(application);
                    ComponentCallbacks2C0776iw.f21830e.m6950a(fg1Var);
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f20543k) {
            C0805jo c0805jo = f20544l;
            y42.m12856c0("FirebaseApp name [DEFAULT] already exists!", !c0805jo.containsKey("[DEFAULT]"));
            y42.m12855b0(context, "Application context cannot be null.");
            hg1Var = new hg1(context, "[DEFAULT]", ug1Var);
            c0805jo.put("[DEFAULT]", hg1Var);
        }
        hg1Var.m6391e();
        return hg1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m6388a() {
        y42.m12856c0("FirebaseApp was deleted", !this.f20550f.get());
    }

    /* JADX INFO: renamed from: b */
    public final Object m6389b(Class cls) {
        m6388a();
        return this.f20548d.mo4017a(cls);
    }

    /* JADX INFO: renamed from: d */
    public final String m6390d() {
        StringBuilder sb = new StringBuilder();
        m6388a();
        byte[] bytes = this.f20546b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        m6388a();
        byte[] bytes2 = this.f20547c.f31843b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public final void m6391e() {
        HashMap map;
        if (lb5.m7908Q(this.f20545a)) {
            StringBuilder sb = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
            m6388a();
            sb.append(this.f20546b);
            Log.i("FirebaseApp", sb.toString());
            lg0 lg0Var = this.f20548d;
            m6388a();
            boolean zEquals = "[DEFAULT]".equals(this.f20546b);
            if (((AtomicReference) lg0Var.f24021f).compareAndSet(null, Boolean.valueOf(zEquals))) {
                synchronized (lg0Var) {
                    map = new HashMap((HashMap) lg0Var.f24016a);
                }
                lg0Var.m7963i(map, zEquals);
            }
            ((ew0) this.f20552h.get()).m5409b();
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
        m6388a();
        sb2.append(this.f20546b);
        Log.i("FirebaseApp", sb2.toString());
        Context context = this.f20545a;
        AtomicReference atomicReference = gg1.f19778b;
        if (atomicReference.get() == null) {
            gg1 gg1Var = new gg1();
            gg1Var.f19779a = context;
            VarHandle.storeStoreFence();
            if (atomicReference.compareAndSet(null, gg1Var)) {
                context.registerReceiver(gg1Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hg1)) {
            return false;
        }
        hg1 hg1Var = (hg1) obj;
        hg1Var.m6388a();
        return this.f20546b.equals(hg1Var.f20546b);
    }

    public final int hashCode() {
        return this.f20546b.hashCode();
    }

    public final String toString() {
        z32 z32VarM12903L = AbstractC1356y5.m12903L(this);
        z32VarM12903L.m13323p(this.f20546b, "name");
        z32VarM12903L.m13323p(this.f20547c, "options");
        return z32VarM12903L.toString();
    }
}
