package p000;

import android.app.Application;
import android.graphics.Region;
import android.os.Parcel;
import android.os.Trace;
import android.util.JsonWriter;
import android.view.KeyEvent;
import android.view.View;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationHandler;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w42 implements ai3, ad2, hp3, bb4, InterfaceC0691gk, bx4, WebViewStartUpCallbackBoundaryInterface, InterfaceC1124rx, sm3, e43, y33, v33 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33089a;

    /* JADX INFO: renamed from: b */
    public Object f33090b;

    public w42(boolean z, byte b) {
        this.f33089a = b;
        switch (b) {
            case 29:
                break;
            default:
                t63 t63Var = new t63((byte) 7);
                wc3 wc3Var = new wc3();
                wc3Var.f33235a = z;
                wc3Var.f33236b = t63Var;
                if (z) {
                    wc3Var.f33237c = new AtomicLong(0L);
                }
                wc3Var.f33238d = new C0461ao(0);
                for (int i = 0; i < 256; i++) {
                    wc3Var.f33238d.addLast(wc3Var.f33236b.invoke(wc3Var));
                }
                VarHandle.storeStoreFence();
                this.f33090b = wc3Var;
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m12080d(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            qz4 qz4Var = new qz4();
            qz4Var.f28904a = th;
            VarHandle.storeStoreFence();
            arrayList.add(qz4Var);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static w42 m12081j(BigInteger bigInteger) {
        w42 w42Var = new w42((byte) 10, false);
        w42Var.f33090b = bigInteger;
        VarHandle.storeStoreFence();
        return w42Var;
    }

    /* JADX INFO: renamed from: v */
    public static uh2 m12082v(w42 w42Var, int i) {
        si2 si2Var = (si2) w42Var.f33090b;
        e94 e94VarM5353c0 = ev0.m5353c0();
        yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
        e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
        try {
            mi2 mi2Var = (mi2) si2Var.f30300f.getValue();
            ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
            vh2 vh2Var = si2Var.f30310p;
            long j = mi2Var.f24949j;
            boolean z = si2Var.f30298d;
            el1 el1Var = new el1((byte) 21);
            VarHandle.storeStoreFence();
            C1126rz c1126rz = vh2Var.f32616c;
            if (c1126rz == null) {
                return wv1.f33764g;
            }
            tt2 tt2Var = vh2Var.f32615b;
            ke3 ke3Var = (ke3) c1126rz.f29740d;
            boolean z2 = ke3Var instanceof ViewOnAttachStateChangeListenerC1329xf;
            ie3 ie3Var = new ie3(c1126rz, i, tt2Var, el1Var);
            ie3Var.f21290d = kl0.m7531a(j);
            if (!z2) {
                ke3Var.mo7510a(ie3Var);
            } else if (z) {
                ViewOnAttachStateChangeListenerC1329xf viewOnAttachStateChangeListenerC1329xf = (ViewOnAttachStateChangeListenerC1329xf) ke3Var;
                viewOnAttachStateChangeListenerC1329xf.f34214b.add(new cg3(1, ie3Var));
                if (!viewOnAttachStateChangeListenerC1329xf.f34215c) {
                    viewOnAttachStateChangeListenerC1329xf.f34215c = true;
                    viewOnAttachStateChangeListenerC1329xf.f34213a.post(viewOnAttachStateChangeListenerC1329xf);
                }
            } else {
                ViewOnAttachStateChangeListenerC1329xf viewOnAttachStateChangeListenerC1329xf2 = (ViewOnAttachStateChangeListenerC1329xf) ke3Var;
                viewOnAttachStateChangeListenerC1329xf2.f34214b.add(new cg3(0, ie3Var));
                if (!viewOnAttachStateChangeListenerC1329xf2.f34215c) {
                    viewOnAttachStateChangeListenerC1329xf2.f34215c = true;
                    viewOnAttachStateChangeListenerC1329xf2.f34213a.post(viewOnAttachStateChangeListenerC1329xf2);
                }
            }
            Trace.setCounter("compose:lazy:schedule_prefetch:index", i);
            return ie3Var;
        } catch (Throwable th) {
            ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
            throw th;
        }
    }

    @Override // p000.bx4, p000.yw4
    /* JADX INFO: renamed from: a */
    public boolean mo3759a() {
        ((C1283w7) this.f33090b).getClass();
        return false;
    }

    @Override // p000.sm3
    public void accept(Object obj, Object obj2) {
        li4 li4Var = (li4) obj2;
        fm5 fm5Var = (fm5) ((im5) obj).getService();
        ri4 ri4Var = (ri4) this.f33090b;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(fm5Var.f23221c);
        int i = sl5.f30377a;
        if (ri4Var == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            ri4Var.writeToParcel(parcelObtain, 0);
        }
        try {
            fm5Var.f23220b.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            li4Var.m7988a(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public ik3 m12083b() {
        b01 b01VarM4248e;
        C1126rz c1126rz = (C1126rz) this.f33090b;
        d01 d01Var = (d01) c1126rz.f29740d;
        synchronized (d01Var) {
            c1126rz.m10504a(true);
            b01VarM4248e = d01Var.m4248e(((a01) c1126rz.f29738b).f9a);
        }
        if (b01VarM4248e != null) {
            return new ik3(b01VarM4248e);
        }
        return null;
    }

    @Override // p000.yw4
    /* JADX INFO: renamed from: c */
    public long mo3358c(AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3) {
        return ((C1283w7) this.f33090b).mo3358c(abstractC0654fk, abstractC0654fk2, abstractC0654fk3);
    }

    @Override // p000.v33
    /* JADX INFO: renamed from: e */
    public void mo140e() {
        ((CountDownLatch) this.f33090b).countDown();
    }

    @Override // p000.bb4
    /* JADX INFO: renamed from: f */
    public Iterator mo3538f(wd3 wd3Var, CharSequence charSequence) {
        return new ya4(this, wd3Var, charSequence);
    }

    @Override // p000.y33
    /* JADX INFO: renamed from: g */
    public void mo141g(Exception exc) {
        ((CountDownLatch) this.f33090b).countDown();
    }

    @Override // p000.InterfaceC0691gk
    public di1 get(int i) {
        return (mi1) this.f33090b;
    }

    /* JADX INFO: renamed from: h */
    public String m12084h(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            m12085i(obj, stringWriter);
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: i */
    public void m12085i(Object obj, Writer writer) throws IOException {
        w92 w92Var = (w92) this.f33090b;
        HashMap map = w92Var.f33174a;
        HashMap map2 = w92Var.f33175b;
        t92 t92Var = w92Var.f33176c;
        boolean z = w92Var.f33177d;
        xb2 xb2Var = new xb2();
        xb2Var.f34132a = true;
        JsonWriter jsonWriter = new JsonWriter(writer);
        xb2Var.f34133b = jsonWriter;
        xb2Var.f34134c = map;
        xb2Var.f34135d = map2;
        xb2Var.f34136e = t92Var;
        xb2Var.f34137f = z;
        VarHandle.storeStoreFence();
        xb2Var.m12643h(obj);
        xb2Var.m12645j();
        jsonWriter.flush();
    }

    /* JADX INFO: renamed from: l */
    public vw3 m12086l(eb0 eb0Var) {
        long jM8333i;
        float f = eb0Var.f17942a;
        float f2 = eb0Var.f17943b;
        mi2 mi2Var = (mi2) this.f33090b;
        int iOrdinal = mi2Var.f24955p.ordinal();
        if (iOrdinal == 0) {
            jM8333i = mi2Var.m8333i() & 4294967295L;
        } else {
            if (iOrdinal != 1) {
                C0670g.m5864c();
                return null;
            }
            jM8333i = mi2Var.m8333i() >> 32;
        }
        float f3 = ((int) jM8333i) - f2;
        vw3 vw3Var = new vw3();
        vw3Var.f32897a = f;
        vw3Var.f32898b = f3;
        VarHandle.storeStoreFence();
        return vw3Var;
    }

    /* JADX INFO: renamed from: m */
    public ArrayList m12087m() {
        mi2 mi2Var = (mi2) this.f33090b;
        List<ni2> list = mi2Var.f24951l;
        ArrayList arrayList = new ArrayList(ib0.m6717y0(list, 10));
        for (ni2 ni2Var : list) {
            d63 d63Var = mi2Var.f24955p;
            qn3 qn3Var = new qn3();
            qn3Var.f28622a = ni2Var;
            qn3Var.f28623b = d63Var;
            VarHandle.storeStoreFence();
            arrayList.add(qn3Var);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public yc3 m12088n() {
        AtomicLong atomicLong;
        wc3 wc3Var = (wc3) this.f33090b;
        C0461ao c0461ao = wc3Var.f33238d;
        Object objRemoveFirst = c0461ao.isEmpty() ? null : c0461ao.removeFirst();
        if (objRemoveFirst == null) {
            objRemoveFirst = wc3Var.f33236b.invoke(wc3Var);
        }
        if (wc3Var.f33235a && (atomicLong = wc3Var.f33237c) != null) {
            atomicLong.incrementAndGet();
        }
        return (yc3) objRemoveFirst;
    }

    /* JADX INFO: renamed from: o */
    public rd6 m12089o(nh3 nh3Var, ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc) {
        long jM10602G;
        long j;
        boolean z;
        po2 po2Var = (po2) this.f33090b;
        ArrayList arrayList = (ArrayList) nh3Var.f25810b;
        po2 po2Var2 = new po2(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            nc3 nc3Var = (nc3) arrayList.get(i);
            long j2 = nc3Var.f25673a;
            long j3 = nc3Var.f25674b;
            mc3 mc3Var = (mc3) po2Var.m9590a(j2);
            if (mc3Var == null) {
                j = j3;
                jM10602G = nc3Var.f25676d;
                z = false;
            } else {
                long j4 = mc3Var.f24816a;
                boolean z2 = mc3Var.f24818c;
                jM10602G = viewTreeObserverOnGlobalLayoutListenerC1140sc.m10602G(mc3Var.f24817b);
                j = j4;
                z = z2;
            }
            long j5 = nc3Var.f25673a;
            ArrayList arrayList2 = arrayList;
            int i2 = size;
            po2Var2.m9592c(j5, new lc3(j5, nc3Var.f25674b, nc3Var.f25676d, nc3Var.f25677e, nc3Var.f25678f, j, jM10602G, z, nc3Var.f25679g, nc3Var.f25681i, nc3Var.f25682j, nc3Var.f25683k, nc3Var.f25684l, nc3Var.f25685m));
            boolean z3 = nc3Var.f25677e;
            if (z3) {
                long j6 = nc3Var.f25675c;
                mc3 mc3Var2 = new mc3();
                mc3Var2.f24816a = j3;
                mc3Var2.f24817b = j6;
                mc3Var2.f24818c = z3;
                VarHandle.storeStoreFence();
                po2Var.m9592c(j2, mc3Var2);
            } else {
                po2Var.m9593d(j2);
            }
            i++;
            arrayList = arrayList2;
            size = i2;
        }
        rd6 rd6Var = new rd6((byte) 2);
        rd6Var.f29197c = po2Var2;
        rd6Var.f29198d = nh3Var;
        VarHandle.storeStoreFence();
        return rd6Var;
    }

    @Override // p000.InterfaceC1124rx
    public void onConnected() {
        ((rt1) this.f33090b).onConnected();
    }

    @Override // p000.InterfaceC1124rx
    public void onConnectionSuspended(int i) {
        ((rt1) this.f33090b).onConnectionSuspended(i);
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface
    public void onSuccess(InvocationHandler invocationHandler) {
        WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface = (WebViewStartUpResultBoundaryInterface) i20.m6592q(WebViewStartUpResultBoundaryInterface.class, invocationHandler);
        Objects.requireNonNull(webViewStartUpResultBoundaryInterface);
        ArrayList arrayListM12080d = m12080d(webViewStartUpResultBoundaryInterface.getBlockingStartUpLocations());
        ArrayList arrayListM12080d2 = kz4.f23647i.mo7351a() ? m12080d(webViewStartUpResultBoundaryInterface.getAsyncStartUpLocations()) : null;
        tt2 tt2Var = new tt2((byte) 17, false);
        tt2Var.f31430d = webViewStartUpResultBoundaryInterface;
        tt2Var.f31428b = arrayListM12080d;
        tt2Var.f31429c = arrayListM12080d2;
        VarHandle.storeStoreFence();
        ((C1040pn) this.f33090b).m9575m(tt2Var);
    }

    @Override // p000.yw4
    /* JADX INFO: renamed from: p */
    public AbstractC0654fk mo4794p(long j, AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3) {
        return ((C1283w7) this.f33090b).mo4794p(j, abstractC0654fk, abstractC0654fk2, abstractC0654fk3);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    @Override // p000.ad2
    /* JADX INFO: renamed from: q */
    public oc2 mo204q(KeyEvent keyEvent) {
        oc2 oc2Var;
        int i = AbstractC1356y5.f34894q;
        int iM3822s = c20.m3822s(keyEvent);
        long jM6579d = i20.m6579d(keyEvent.getKeyCode());
        oc2 oc2Var2 = null;
        if (nc2.m8689a(jM6579d, nc2.f25665s)) {
            if (iM3822s == 0 || iM3822s == 8 || iM3822s == AbstractC1356y5.f34895r) {
                oc2Var = oc2.DELETE_PREV_CHAR;
            } else if (iM3822s == 2 || iM3822s == i) {
                oc2Var = oc2.DELETE_PREV_WORD;
            } else {
                oc2Var = null;
            }
        } else if ((nc2.m8689a(jM6579d, nc2.f25664r) || nc2.m8689a(jM6579d, nc2.f25636E)) && (iM3822s == 0 || iM3822s == 8 || iM3822s == 2 || iM3822s == i)) {
            oc2Var = oc2.NEW_LINE;
        } else {
            oc2Var = null;
        }
        if (oc2Var != null) {
            return oc2Var;
        }
        int iM3822s2 = c20.m3822s(keyEvent);
        if (iM3822s2 == i) {
            long jM6579d2 = i20.m6579d(keyEvent.getKeyCode());
            if (nc2.m8689a(jM6579d2, nc2.f25652f) || nc2.m8689a(jM6579d2, nc2.f25639H)) {
                oc2Var2 = oc2.SELECT_LEFT_WORD;
            } else if (nc2.m8689a(jM6579d2, nc2.f25653g) || nc2.m8689a(jM6579d2, nc2.f25640I)) {
                oc2Var2 = oc2.SELECT_RIGHT_WORD;
            } else if (nc2.m8689a(jM6579d2, nc2.f25650d) || nc2.m8689a(jM6579d2, nc2.f25637F)) {
                oc2Var2 = oc2.SELECT_PREV_PARAGRAPH;
            } else if (nc2.m8689a(jM6579d2, nc2.f25651e) || nc2.m8689a(jM6579d2, nc2.f25638G)) {
                oc2Var2 = oc2.SELECT_NEXT_PARAGRAPH;
            }
        } else if (iM3822s2 == 2) {
            long jM6579d3 = i20.m6579d(keyEvent.getKeyCode());
            if (nc2.m8689a(jM6579d3, nc2.f25652f) || nc2.m8689a(jM6579d3, nc2.f25639H)) {
                oc2Var2 = oc2.LEFT_WORD;
            } else if (nc2.m8689a(jM6579d3, nc2.f25653g) || nc2.m8689a(jM6579d3, nc2.f25640I)) {
                oc2Var2 = oc2.RIGHT_WORD;
            } else if (nc2.m8689a(jM6579d3, nc2.f25650d) || nc2.m8689a(jM6579d3, nc2.f25637F)) {
                oc2Var2 = oc2.PREV_PARAGRAPH;
            } else if (nc2.m8689a(jM6579d3, nc2.f25651e) || nc2.m8689a(jM6579d3, nc2.f25638G)) {
                oc2Var2 = oc2.NEXT_PARAGRAPH;
            } else if (nc2.m8689a(jM6579d3, nc2.f25657k)) {
                oc2Var2 = oc2.DELETE_PREV_CHAR;
            } else if (nc2.m8689a(jM6579d3, nc2.f25666t)) {
                oc2Var2 = oc2.DELETE_NEXT_WORD;
            } else if (nc2.m8689a(jM6579d3, nc2.f25633B)) {
                oc2Var2 = oc2.DESELECT;
            }
        } else if (iM3822s2 == 8) {
            long jM6579d4 = i20.m6579d(keyEvent.getKeyCode());
            if (nc2.m8689a(jM6579d4, nc2.f25668v) || nc2.m8689a(jM6579d4, nc2.f25641J)) {
                oc2Var2 = oc2.SELECT_LINE_START;
            } else if (nc2.m8689a(jM6579d4, nc2.f25669w) || nc2.m8689a(jM6579d4, nc2.f25642K)) {
                oc2Var2 = oc2.SELECT_LINE_END;
            }
        } else if (iM3822s2 == 1 && nc2.m8689a(i20.m6579d(keyEvent.getKeyCode()), nc2.f25666t)) {
            oc2Var2 = oc2.DELETE_TO_LINE_END;
        }
        return oc2Var2 == null ? ((f70) this.f33090b).mo204q(keyEvent) : oc2Var2;
    }

    @Override // p000.yw4
    /* JADX INFO: renamed from: s */
    public AbstractC0654fk mo4795s(long j, AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3) {
        return ((C1283w7) this.f33090b).mo4795s(j, abstractC0654fk, abstractC0654fk2, abstractC0654fk3);
    }

    @Override // p000.yw4
    /* JADX INFO: renamed from: t */
    public AbstractC0654fk mo12090t(AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3) {
        return ((C1283w7) this.f33090b).mo12090t(abstractC0654fk, abstractC0654fk2, abstractC0654fk3);
    }

    public String toString() {
        switch (this.f33089a) {
            case 29:
                StringBuilder sb = new StringBuilder("1");
                for (vc6 vc6Var : vc6.values()) {
                    sp5 sp5Var = (sp5) ((EnumMap) this.f33090b).get(vc6Var);
                    if (sp5Var == null) {
                        sp5Var = sp5.UNSET;
                    }
                    sb.append(sp5Var.f30486a);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2 A[LOOP:0: B:26:0x008d->B:36:0x00c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x00c5 A[EDGE_INSN: B:60:0x00c5->B:37:0x00c5 BREAK  A[LOOP:0: B:26:0x008d->B:36:0x00c2], SYNTHETIC] */
    /* JADX INFO: renamed from: u */
    public Object m12091u(b80 b80Var, wp1 wp1Var) {
        d74 d74Var;
        y14 y14Var;
        if (((zh0) this.f33090b) == null) {
            kd3.m7503b("Called runAndWatch on a manager that has been disposed of");
        }
        zh0 zh0Var = (zh0) this.f33090b;
        if ((zh0Var instanceof d74) && (y14Var = (d74Var = (d74) zh0Var).f16827j) != null && !y14Var.equals(b80Var)) {
            dv2 dv2Var = new dv2((byte) 1);
            dv2Var.f17425f = dt0.m4723y();
            dv2Var.f17426g = new ArrayList();
            dv2Var.f17427h = new lw2();
            C1017p0 c1017p0 = new C1017p0((byte) 24);
            c1017p0.f27254b = dv2Var;
            VarHandle.storeStoreFence();
            k94.m7445b(k94.f23010a);
            synchronized (k94.f23012c) {
                k94.f23017h = hb0.m6311W0(k94.f23017h, c1017p0);
            }
            C1040pn c1040pn = new C1040pn((byte) 17);
            c1040pn.f27754b = c1017p0;
            VarHandle.storeStoreFence();
            dv2Var.f17428i = c1040pn;
            VarHandle.storeStoreFence();
            y14 y14Var2 = d74Var.f16827j;
            if (y14Var2 == null) {
                kd3.m7503b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            mw2 mw2Var = d74Var.f16825h;
            if (mw2Var != null) {
                Object[] objArr = mw2Var.f25258b;
                long[] jArr = mw2Var.f25257a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    dv2Var.m4748u(y14Var2, objArr[(i << 3) + i3]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                            if (i != length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else {
                dv2Var.m4748u(y14Var2, d74Var.f16823f);
            }
            dv2Var.mo4395j();
            d74Var.mo4396k();
            this.f33090b = dv2Var;
        }
        zh0 zh0Var2 = (zh0) this.f33090b;
        e94 e94VarMo3785u = k94.m7451h().mo3785u(zh0Var2.mo4397o(b80Var));
        zh0Var2.mo4394i(b80Var);
        try {
            e94 e94VarM5018j = e94VarMo3785u.m5018j();
            try {
                Object objInvoke = wp1Var.invoke();
                e94.m5011q(e94VarM5018j);
                e94VarMo3785u.mo3384c();
                zh0Var2.mo4395j();
                return objInvoke;
            } catch (Throwable th) {
                e94.m5011q(e94VarM5018j);
                throw th;
            }
        } catch (Throwable th2) {
            e94VarMo3785u.mo3384c();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: w */
    public void m12092w(s52 s52Var) {
        ((Region) this.f33090b).set(s52Var.f29916a, s52Var.f29917b, s52Var.f29918c, s52Var.f29919d);
    }

    /* JADX INFO: renamed from: x */
    public wo5 m12093x() {
        Application application = (Application) this.f33090b;
        if (application == null) {
            C1077qn.m9989o(String.valueOf(Application.class.getCanonicalName()).concat(" must be set"));
            return null;
        }
        wo5 wo5Var = new wo5();
        wo5Var.f33566a = wo5Var;
        C1392z4 c1392z4 = new C1392z4();
        c1392z4.f35744a = application;
        VarHandle.storeStoreFence();
        wo5Var.f33567b = c1392z4;
        byte b = 1;
        zp5 zp5Var = new zp5(b);
        zp5Var.f36258b = c1392z4;
        VarHandle.storeStoreFence();
        cr6 cr6VarM4145a = cr6.m4145a(zp5Var);
        wo5Var.f33568c = cr6VarM4145a;
        cr6 cr6VarM4145a2 = cr6.m4145a(co5.f16187a);
        wo5Var.f33569d = cr6VarM4145a2;
        wd3 wd3Var = new wd3((byte) 28);
        wd3Var.f33259b = wo5Var;
        VarHandle.storeStoreFence();
        byte b2 = 2;
        rr5 rr5Var = new rr5(b2);
        rr5Var.f29555b = wd3Var;
        VarHandle.storeStoreFence();
        cr6 cr6VarM4145a3 = cr6.m4145a(rr5Var);
        wo5Var.f33570e = cr6VarM4145a3;
        yg3 yg3Var = new yg3((byte) 24);
        yg3Var.f35215b = c1392z4;
        yg3Var.f35216c = cr6VarM4145a;
        VarHandle.storeStoreFence();
        cr6 cr6VarM4145a4 = cr6.m4145a(new pj5((byte) 22));
        wo5Var.f33571f = cr6VarM4145a4;
        byte b3 = 0;
        zp5 zp5Var2 = new zp5(b3);
        zp5Var2.f36258b = c1392z4;
        VarHandle.storeStoreFence();
        cr6 cr6VarM4145a5 = cr6.m4145a(zp5Var2);
        pq3 pq3Var = new pq3((byte) 16);
        pq3Var.f27896b = c1392z4;
        pq3Var.f27897c = cr6VarM4145a5;
        VarHandle.storeStoreFence();
        cr6 cr6VarM4145a6 = cr6.m4145a(pq3Var);
        hq5 hq5Var = new hq5(b3);
        hq5Var.f20790c = c1392z4;
        hq5Var.f20789b = cr6VarM4145a;
        hq5Var.f20791d = cr6VarM4145a6;
        VarHandle.storeStoreFence();
        wo5Var.f33574i = hq5Var;
        zp5 zp5Var3 = new zp5(b2);
        zp5Var3.f36258b = c1392z4;
        VarHandle.storeStoreFence();
        cr6 cr6VarM4145a7 = cr6.m4145a(zp5Var3);
        hq5 hq5Var2 = new hq5(b);
        hq5Var2.f20789b = cr6VarM4145a2;
        hq5Var2.f20790c = c1392z4;
        hq5Var2.f20791d = cr6VarM4145a7;
        VarHandle.storeStoreFence();
        cr6 cr6VarM4145a8 = cr6.m4145a(hq5Var2);
        wo5Var.f33572g = cr6VarM4145a8;
        C1283w7 c1283w7 = new C1283w7((byte) 26);
        c1283w7.f33127c = cr6VarM4145a4;
        c1283w7.f33128d = hq5Var;
        c1283w7.f33129e = cr6VarM4145a;
        c1283w7.f33126b = cr6VarM4145a8;
        VarHandle.storeStoreFence();
        C1372yl c1372yl = new C1372yl();
        c1372yl.f35304a = c1392z4;
        c1372yl.f35305b = cr6VarM4145a2;
        c1372yl.f35306c = cr6VarM4145a;
        c1372yl.f35307d = cr6VarM4145a3;
        c1372yl.f35308e = yg3Var;
        c1372yl.f35309f = c1283w7;
        c1372yl.f35310g = cr6VarM4145a4;
        c1372yl.f35311h = cr6VarM4145a8;
        VarHandle.storeStoreFence();
        r36 r36Var = new r36();
        r36Var.f28986b = cr6VarM4145a;
        r36Var.f28985a = c1372yl;
        r36Var.f28987c = cr6VarM4145a3;
        r36Var.f28988d = cr6VarM4145a8;
        VarHandle.storeStoreFence();
        wo5Var.f33573h = cr6.m4145a(r36Var);
        VarHandle.storeStoreFence();
        return wo5Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    /* JADX INFO: renamed from: y */
    public void m12094y(vc6 vc6Var, int i) {
        sp5 sp5Var;
        if (i == -30) {
            sp5Var = sp5.TCF;
        } else if (i == -20) {
            sp5Var = sp5.API;
        } else if (i == -10) {
            sp5Var = sp5.MANIFEST;
        } else if (i != 0) {
            sp5Var = i != 30 ? sp5.UNSET : sp5.INITIALIZATION;
        } else {
            sp5Var = sp5.API;
        }
        ((EnumMap) this.f33090b).put(vc6Var, sp5Var);
    }

    /* JADX INFO: renamed from: z */
    public void m12095z(vc6 vc6Var, sp5 sp5Var) {
        ((EnumMap) this.f33090b).put(vc6Var, sp5Var);
    }

    @Override // p000.ai3
    public Object get() {
        return this.f33090b;
    }

    @Override // p000.e43
    public void onSuccess(Object obj) {
        ((CountDownLatch) this.f33090b).countDown();
    }

    public w42(byte b) {
        this.f33089a = b;
        switch (b) {
            case 29:
                this.f33090b = new EnumMap(vc6.class);
                break;
            default:
                this.f33090b = new CountDownLatch(1);
                break;
        }
    }

    public /* synthetic */ w42(byte b, boolean z) {
        this.f33089a = b;
    }

    public w42(View view) {
        this.f33089a = (byte) 13;
        pq3 pq3Var = new pq3((byte) 2);
        pq3Var.f27896b = view;
        pq3Var.f27897c = view;
        VarHandle.storeStoreFence();
        this.f33090b = pq3Var;
    }

    public w42(C1126rz c1126rz) {
        this.f33089a = (byte) 8;
        this.f33090b = c1126rz;
    }
}
