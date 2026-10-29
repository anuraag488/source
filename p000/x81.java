package p000;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.lang.invoke.VarHandle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class x81 {

    /* JADX INFO: renamed from: a */
    public static final String f34060a = wn2.m12327g("EnqueueRunnable");

    /* JADX INFO: renamed from: a */
    public static boolean m12528a(x15 x15Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        HashSet hashSetM12461a = x15.m12461a(x15Var);
        g25 g25Var = x15Var.f33927a;
        List list = x15Var.f33928b;
        boolean z5 = false;
        String[] strArr = (String[]) hashSetM12461a.toArray(new String[0]);
        lc1[] lc1VarArr = lc1.f23932a;
        ik0 ik0Var = g25Var.f19513b;
        ik0Var.getClass();
        ik0Var.f21506c.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase = g25Var.f19514c;
        boolean z6 = strArr.length == 0;
        if (!z6) {
            int length = strArr.length;
            int i = 0;
            z = false;
            z2 = false;
            z3 = true;
            while (true) {
                if (i < length) {
                    String str = strArr[i];
                    q25 q25VarM11210b = workDatabase.mo3080w().m11210b(str);
                    if (q25VarM11210b == null) {
                        wn2.m12326e().m12329c(f34060a, "Prerequisite " + str + " doesn't exist; not enqueuing");
                    } else {
                        f25 f25Var = q25VarM11210b.f28163b;
                        z3 &= f25Var == f25.f18683c;
                        if (f25Var == f25.f18684d) {
                            z2 = true;
                        } else if (f25Var == f25.f18686f) {
                            z = true;
                        }
                        i++;
                    }
                }
                x15Var.f33931e = true;
                return z5;
            }
        }
        z = false;
        z2 = false;
        z3 = true;
        boolean zIsEmpty = TextUtils.isEmpty(null);
        if (!zIsEmpty && z6) {
            workDatabase.mo3080w().getClass();
            throw null;
        }
        Iterator it = list.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            i43 i43Var = (i43) it.next();
            q25 q25Var = i43Var.f21125b;
            UUID uuid = i43Var.f21124a;
            if (z6 || z3) {
                q25Var.f28175n = jCurrentTimeMillis;
            } else if (z2) {
                q25Var.f28163b = f25.f18684d;
            } else if (z) {
                q25Var.f28163b = f25.f18686f;
            } else {
                q25Var.f28163b = f25.f18685e;
            }
            WorkDatabase workDatabase2 = workDatabase;
            if (q25Var.f28163b == f25.f18681a) {
                z7 = true;
            }
            u25 u25VarMo3080w = workDatabase2.mo3080w();
            Iterator it2 = it;
            boolean zM13736a = q25Var.f28166e.m13736a("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
            long j = jCurrentTimeMillis;
            boolean zM13736a2 = q25Var.f28166e.m13736a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
            boolean zM13736a3 = q25Var.f28166e.m13736a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
            if (!zM13736a && zM13736a2 && zM13736a3) {
                String str2 = q25Var.f28164c;
                ys0 ys0Var = new ys0();
                LinkedHashMap linkedHashMap = ys0Var.f35491a;
                ys0Var.m13231a(q25Var.f28166e.f36339a);
                linkedHashMap.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str2);
                zs0 zs0Var = new zs0(linkedHashMap);
                C0006a5.m57M(zs0Var);
                q25Var = new q25(q25Var.f28162a, q25Var.f28163b, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", q25Var.f28165d, zs0Var, q25Var.f28167f, q25Var.f28168g, q25Var.f28169h, q25Var.f28170i, q25Var.f28171j, q25Var.f28172k, q25Var.f28173l, q25Var.f28174m, q25Var.f28175n, q25Var.f28176o, q25Var.f28177p, q25Var.f28178q, q25Var.f28179r, q25Var.f28180s, q25Var.f28181t, q25Var.f28182u, q25Var.f28183v, q25Var.f28184w, q25Var.f28185x, q25Var.f28186y);
            }
            WorkDatabase workDatabase3 = u25VarMo3080w.f31629a;
            byte b = 27;
            cz3 cz3Var = new cz3(b);
            cz3Var.f16638b = u25VarMo3080w;
            cz3Var.f16639c = q25Var;
            VarHandle.storeStoreFence();
            as4.m3231J(workDatabase3, false, true, cz3Var);
            if (!z6) {
                for (String str3 : strArr) {
                    String string = uuid.toString();
                    oy0 oy0Var = new oy0();
                    oy0Var.f27204a = string;
                    oy0Var.f27205b = str3;
                    VarHandle.storeStoreFence();
                    ry0 ry0VarMo3063f = workDatabase2.mo3063f();
                    WorkDatabase workDatabase4 = ry0VarMo3063f.f29725a;
                    C0558d0 c0558d0 = new C0558d0(b);
                    c0558d0.f16655b = ry0VarMo3063f;
                    c0558d0.f16656c = oy0Var;
                    VarHandle.storeStoreFence();
                    as4.m3231J(workDatabase4, false, true, c0558d0);
                }
            }
            w25 w25VarMo3081x = workDatabase2.mo3081x();
            String string2 = uuid.toString();
            LinkedHashSet<String> linkedHashSet = i43Var.f21126c;
            w25VarMo3081x.getClass();
            for (String str4 : linkedHashSet) {
                v25 v25Var = new v25();
                v25Var.f32351a = str4;
                v25Var.f32352b = string2;
                VarHandle.storeStoreFence();
                WorkDatabase workDatabase5 = w25VarMo3081x.f33049a;
                cz3 cz3Var2 = new cz3((byte) 28);
                cz3Var2.f16638b = w25VarMo3081x;
                cz3Var2.f16639c = v25Var;
                VarHandle.storeStoreFence();
                as4.m3231J(workDatabase5, false, true, cz3Var2);
            }
            if (zIsEmpty) {
                z4 = false;
            } else {
                l25 l25VarMo3078u = workDatabase2.mo3078u();
                String string3 = uuid.toString();
                k25 k25Var = new k25();
                k25Var.f22836a = string3;
                VarHandle.storeStoreFence();
                WorkDatabase workDatabase6 = l25VarMo3078u.f23750a;
                cz3 cz3Var3 = new cz3((byte) 24);
                cz3Var3.f16638b = l25VarMo3078u;
                cz3Var3.f16639c = k25Var;
                VarHandle.storeStoreFence();
                z4 = false;
                as4.m3231J(workDatabase6, false, true, cz3Var3);
            }
            workDatabase = workDatabase2;
            it = it2;
            jCurrentTimeMillis = j;
        }
        z5 = z7;
        x15Var.f33931e = true;
        return z5;
    }
}
