package p000;

import ads_mobile_sdk.C0310ra;
import ads_mobile_sdk.al3;
import ads_mobile_sdk.cr3;
import ads_mobile_sdk.el3;
import ads_mobile_sdk.g44;
import ads_mobile_sdk.ir0;
import ads_mobile_sdk.oy3;
import ads_mobile_sdk.sv1;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.work.Worker;
import androidx.work.impl.WorkDatabase;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: eh */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0612eh implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18080a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f18081b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f18082c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f18083d;

    public /* synthetic */ RunnableC0612eh(byte b) {
        this.f18080a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObjectOptJSONObject;
        e25 e25VarM7904L;
        ArrayList arrayList;
        byte b;
        byte b2 = 3;
        int i = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        boolean z = false;
        boolean zM6214e = false;
        boolean zBooleanValue = true;
        boolean z2 = true;
        switch (this.f18080a) {
            case 0:
                C0651fh c0651fh = (C0651fh) this.f18081b;
                C0527ch c0527ch = (C0527ch) this.f18082c;
                C0575dh c0575dh = (C0575dh) this.f18083d;
                View view = c0651fh.f18971a;
                oi1 oi1Var = new oi1();
                oi1Var.f26761a = c0527ch;
                VarHandle.storeStoreFence();
                ActionMode actionModeStartActionMode = view.startActionMode(oi1Var, 1);
                c0651fh.f18978h = actionModeStartActionMode;
                if (actionModeStartActionMode == null) {
                    c0575dh.close();
                    return;
                }
                return;
            case 1:
                WorkDatabase workDatabase = (WorkDatabase) this.f18081b;
                String str = (String) this.f18082c;
                g25 g25Var = (g25) this.f18083d;
                WorkDatabase workDatabase2 = workDatabase.mo3080w().f31629a;
                C1051py c1051py = new C1051py((byte) 22);
                c1051py.f28076b = str;
                VarHandle.storeStoreFence();
                Iterator it = ((List) as4.m3231J(workDatabase2, true, false, c1051py)).iterator();
                while (it.hasNext()) {
                    AbstractC1356y5.m12919m(g25Var, (String) it.next());
                }
                return;
            case 2:
                tm3 tm3Var = (tm3) this.f18081b;
                String str2 = (String) this.f18082c;
                wj0 wj0Var = (wj0) this.f18083d;
                nh3 nh3Var = tm3Var.f31239a;
                InterfaceC0828ka interfaceC0828ka = (InterfaceC0828ka) ((bi3) nh3Var.f25810b).get();
                if (interfaceC0828ka == null) {
                    return;
                }
                JSONObject jSONObject = wj0Var.f33420e;
                if (jSONObject.length() < 1) {
                    return;
                }
                JSONObject jSONObject2 = wj0Var.f33417b;
                if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str2)) != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                    if (strOptString.isEmpty()) {
                        return;
                    }
                    synchronized (((Map) nh3Var.f25811c)) {
                        try {
                            if (!strOptString.equals(((Map) nh3Var.f25811c).get(str2))) {
                                ((Map) nh3Var.f25811c).put(str2, strOptString);
                                Bundle bundle = new Bundle();
                                bundle.putString("arm_key", str2);
                                bundle.putString("arm_value", jSONObject2.optString(str2));
                                bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                                C0865la c0865la = (C0865la) interfaceC0828ka;
                                c0865la.m7883a("fp", "personalization_assignment", bundle);
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("_fpid", strOptString);
                                c0865la.m7883a("fp", "_fpc", bundle2);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            case 3:
                jg3 jg3Var = (jg3) this.f18081b;
                p60 p60Var = (p60) this.f18082c;
                h35 h35Var = (h35) this.f18083d;
                jg3Var.getClass();
                try {
                    zBooleanValue = ((Boolean) p60Var.f27392b.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (jg3Var.f22256j) {
                    try {
                        e25VarM7904L = lb5.m7904L(h35Var.f20341a);
                        String str3 = e25VarM7904L.f17648a;
                        if (jg3Var.m7106c(str3) == h35Var) {
                            jg3Var.m7105b(str3);
                        }
                        wn2.m12326e().m12328b(jg3.f22246k, jg3.class.getSimpleName() + " " + str3 + " executed; reschedule = " + zBooleanValue);
                        arrayList = new ArrayList(jg3Var.f22255i);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((rb1) obj).mo3084d(e25VarM7904L, zBooleanValue);
                }
                return;
            case 4:
                rz4 rz4Var = (rz4) this.f18081b;
                C0310ra c0310ra = (C0310ra) this.f18082c;
                Context context = (Context) this.f18083d;
                WebView.getWebViewClassLoader();
                if (kz4.f23646h.mo7351a()) {
                    pz4 pz4Var = mz4.f25346a;
                    C1040pn c1040pn = new C1040pn((byte) 20);
                    c1040pn.f27754b = c0310ra;
                    VarHandle.storeStoreFence();
                    pz4Var.mo6795g(rz4Var, c1040pn);
                    return;
                }
                if (rz4Var.f29756b) {
                    WebSettings.getDefaultUserAgent(context.getApplicationContext());
                }
                Handler handler = new Handler(Looper.getMainLooper());
                RunnableC1054q0 runnableC1054q0 = new RunnableC1054q0((byte) 16);
                runnableC1054q0.f28115b = c0310ra;
                VarHandle.storeStoreFence();
                handler.post(runnableC1054q0);
                return;
            case 5:
                pq3 pq3Var = (pq3) this.f18081b;
                qb4 qb4Var = (qb4) this.f18082c;
                jg3 jg3Var2 = (jg3) pq3Var.f27896b;
                jg3Var2.getClass();
                e25 e25Var = qb4Var.f28367a;
                String str4 = e25Var.f17648a;
                ArrayList arrayList2 = new ArrayList();
                WorkDatabase workDatabase3 = jg3Var2.f22250d;
                wx0 wx0Var = new wx0(z2 ? 1 : 0);
                wx0Var.f33818b = jg3Var2;
                wx0Var.f33819c = arrayList2;
                wx0Var.f33820d = str4;
                VarHandle.storeStoreFence();
                q25 q25Var = (q25) workDatabase3.m3073p(wx0Var);
                if (q25Var == null) {
                    wn2.m12326e().m12332h(jg3.f22246k, "Didn't find WorkSpec for id " + e25Var);
                    jg3Var2.m7107e(e25Var);
                    return;
                }
                synchronized (jg3Var2.f22256j) {
                    try {
                        synchronized (jg3Var2.f22256j) {
                            b = jg3Var2.m7106c(str4) != null ? (byte) 1 : (byte) 0;
                            break;
                        }
                        if (b != 0) {
                            Set set = (Set) jg3Var2.f22253g.get(str4);
                            if (((qb4) set.iterator().next()).f28367a.f17649b == e25Var.f17649b) {
                                set.add(qb4Var);
                                wn2.m12326e().m12328b(jg3.f22246k, "Work " + e25Var + " is already enqueued for processing");
                            } else {
                                jg3Var2.m7107e(e25Var);
                            }
                            return;
                        }
                        if (q25Var.f28181t != e25Var.f17649b) {
                            jg3Var2.m7107e(e25Var);
                            return;
                        }
                        Context context2 = jg3Var2.f22247a;
                        ik0 ik0Var = jg3Var2.f22248b;
                        j25 j25Var = jg3Var2.f22249c;
                        WorkDatabase workDatabase4 = jg3Var2.f22250d;
                        C0602e8 c0602e8 = new C0602e8();
                        c0602e8.f17867a = ik0Var;
                        c0602e8.f17868b = j25Var;
                        c0602e8.f17869c = workDatabase4;
                        c0602e8.f17870d = q25Var;
                        c0602e8.f17871e = arrayList2;
                        c0602e8.f17872f = context2.getApplicationContext();
                        VarHandle.storeStoreFence();
                        h35 h35VarM4951l = c0602e8.m4951l();
                        p60 p60VarM6210a = h35VarM4951l.m6210a();
                        RunnableC0612eh runnableC0612eh = new RunnableC0612eh(b2);
                        runnableC0612eh.f18081b = jg3Var2;
                        runnableC0612eh.f18082c = p60VarM6210a;
                        runnableC0612eh.f18083d = h35VarM4951l;
                        VarHandle.storeStoreFence();
                        p60VarM6210a.f27392b.mo6454a(runnableC0612eh, jg3Var2.f22249c.f21976e);
                        jg3Var2.f22252f.put(str4, h35VarM4951l);
                        HashSet hashSet = new HashSet();
                        hashSet.add(qb4Var);
                        jg3Var2.f22253g.put(str4, hashSet);
                        wn2.m12326e().m12328b(jg3.f22246k, jg3.class.getSimpleName() + ": processing " + e25Var);
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            case 6:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f18081b;
                m60 m60Var = (m60) this.f18082c;
                sj4 sj4Var = (sj4) this.f18083d;
                if (atomicBoolean.get()) {
                    return;
                }
                try {
                    m60Var.m8198a(((Worker) sj4Var.f30344b).mo3057a());
                    return;
                } catch (Throwable th4) {
                    m60Var.m8199b(th4);
                    return;
                }
            case 7:
                e35 e35Var = (e35) this.f18081b;
                ml3 ml3Var = (ml3) this.f18082c;
                h35 h35Var2 = (h35) this.f18083d;
                if (e35Var instanceof b35) {
                    cm2 am2Var = ((b35) e35Var).f15063a;
                    u25 u25Var = h35Var2.f20348h;
                    String str5 = h35Var2.f20343c;
                    f25 f25VarM11209a = u25Var.m11209a(str5);
                    WorkDatabase workDatabase5 = h35Var2.f20347g.mo3079v().f24599a;
                    C1051py c1051py2 = new C1051py((byte) 12);
                    c1051py2.f28076b = str5;
                    VarHandle.storeStoreFence();
                    as4.m3231J(workDatabase5, false, true, c1051py2);
                    if (f25VarM11209a != null) {
                        if (f25VarM11209a == f25.f18682b) {
                            q25 q25Var2 = h35Var2.f20341a;
                            String str6 = h35Var2.f20351k;
                            if (am2Var instanceof bm2) {
                                String str7 = i35.f21109a;
                                wn2.m12326e().m12331f(str7, "Worker result SUCCESS for " + str6);
                                if (q25Var2.m9717b()) {
                                    h35Var2.m6213d();
                                } else {
                                    u25Var.m11214f(f25.f18683c, str5);
                                    zs0 zs0Var = ((bm2) am2Var).f15412a;
                                    WorkDatabase workDatabase6 = u25Var.f31629a;
                                    cz3 cz3Var = new cz3((byte) 26);
                                    cz3Var.f16638b = zs0Var;
                                    cz3Var.f16639c = str5;
                                    VarHandle.storeStoreFence();
                                    as4.m3231J(workDatabase6, false, true, cz3Var);
                                    h35Var2.f20346f.getClass();
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    ry0 ry0Var = h35Var2.f20349i;
                                    for (String str8 : ry0Var.m10497a(str5)) {
                                        if (u25Var.m11209a(str8) == f25.f18685e) {
                                            WorkDatabase workDatabase7 = ry0Var.f29725a;
                                            C1051py c1051py3 = new C1051py(b2);
                                            c1051py3.f28076b = str8;
                                            VarHandle.storeStoreFence();
                                            if (((Boolean) as4.m3231J(workDatabase7, true, false, c1051py3)).booleanValue()) {
                                                wn2.m12326e().m12331f(i35.f21109a, "Setting status to enqueued for ".concat(str8));
                                                u25Var.m11214f(f25.f18681a, str8);
                                                u25Var.m11213e(str8, jCurrentTimeMillis);
                                                h35Var2.f20354n.add(str8);
                                            }
                                        }
                                    }
                                }
                            } else {
                                String str9 = i35.f21109a;
                                wn2.m12326e().m12331f(str9, "Worker result FAILURE for " + str6);
                                if (q25Var2.m9717b()) {
                                    h35Var2.m6213d();
                                } else {
                                    if (am2Var == null) {
                                        am2Var = new am2();
                                    }
                                    h35Var2.m6216g(am2Var);
                                }
                            }
                        } else if (!f25VarM11209a.m5459a()) {
                            h35Var2.m6212c(-512);
                            z = true;
                        }
                    }
                    ml3Var.f25002a = z;
                } else if (e35Var instanceof a35) {
                    h35Var2.m6211b(new am2());
                    ml3Var.f25002a = false;
                } else if (e35Var instanceof c35) {
                    ml3Var.f25002a = h35Var2.m6214e(((c35) e35Var).f15788a);
                } else {
                    if (!(e35Var instanceof d35)) {
                        C0670g.m5864c();
                        return;
                    }
                    if (((d35) e35Var).f16765a) {
                        zM6214e = h35Var2.m6214e(-256);
                    } else {
                        h35Var2.m6211b(new am2());
                    }
                    ml3Var.f25002a = zM6214e;
                }
                h35Var2.f20345e.getClass();
                return;
            case 8:
                al3 al3Var = (al3) this.f18081b;
                sv1 sv1Var = (sv1) this.f18082c;
                MotionEvent motionEvent = (MotionEvent) this.f18083d;
                try {
                    try {
                        sv1Var.m2275a(motionEvent);
                    } finally {
                        motionEvent.recycle();
                    }
                    break;
                } catch (g44 e) {
                    oy3 oy3Var = al3Var.f676d;
                    ir0 ir0Var = ir0.f5281b;
                    oy3Var.f8414a.m1191a(15004, -1L, e, null);
                    break;
                }
                return;
            default:
                el3 el3Var = (el3) this.f18081b;
                HashMap map = (HashMap) this.f18082c;
                Context context3 = (Context) this.f18083d;
                cr3 cr3Var = el3Var.f3094g;
                cr3Var.getClass();
                HashMap map2 = new HashMap();
                Iterator it2 = cr3Var.f2249a.iterator();
                while (it2.hasNext()) {
                    ((xj5) it2.next()).mo215a(map2);
                }
                map.putAll(map2);
                el3Var.m833a(map);
                map.put("f", "q");
                map.put("ctx", context3);
                return;
        }
    }
}
