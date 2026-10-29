package p000;

import android.app.Activity;
import android.view.Choreographer;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.ViewTreeObserver;
import androidx.work.Worker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: gf */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0686gf implements yp1, j60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f19761a;

    /* JADX INFO: renamed from: b */
    public Object f19762b;

    /* JADX INFO: renamed from: c */
    public Object f19763c;

    public /* synthetic */ C0686gf(byte b) {
        this.f19761a = b;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.yp1
    public final Object invoke(Object obj) {
        gl3 gl3Var;
        long j;
        Map mapSingletonMap;
        Map mapSingletonMap2;
        boolean zM3621g = true;
        switch (this.f19761a) {
            case 0:
                a42 a42Var = (a42) this.f19762b;
                synchronized (a42Var.f97c) {
                    try {
                        a42Var.f99e = true;
                        uw2 uw2Var = a42Var.f98d;
                        Object[] objArr = uw2Var.f32211a;
                        int i = uw2Var.f32213c;
                        for (int i2 = 0; i2 < i; i2++) {
                            f23 f23Var = (f23) ((ez4) objArr[i2]).get();
                            if (f23Var != null && (gl3Var = f23Var.f18674b) != null) {
                                gl3Var.closeConnection();
                                f23Var.f18674b = null;
                            }
                        }
                        a42Var.f98d.m11668g();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                bl4 bl4Var = ((C0723hf) this.f19763c).f20524b;
                bl4Var.f15405b.set(null);
                bl4Var.f15404a.mo4551g();
                return ju4.f22634a;
            case 1:
                C0946nh c0946nh = (C0946nh) this.f19762b;
                ChoreographerFrameCallbackC0983oh choreographerFrameCallbackC0983oh = (ChoreographerFrameCallbackC0983oh) this.f19763c;
                synchronized (c0946nh.f25791d) {
                    c0946nh.f25793f.remove(choreographerFrameCallbackC0983oh);
                }
                return ju4.f22634a;
            case 2:
                ((Choreographer) ((C1034ph) this.f19762b).f27603b).removeFrameCallback((ChoreographerFrameCallbackC0983oh) this.f19763c);
                return ju4.f22634a;
            case 3:
                try {
                    ((ek3) this.f19762b).m5153d();
                    break;
                } catch (Throwable unused) {
                }
                return ju4.f22634a;
            case 4:
                KeyEvent keyEvent = ((sc2) obj).f30158a;
                if (((uj2) this.f19762b).m11574a() == wu1.f33742b && keyEvent.getKeyCode() == 4 && qs5.m10083H(keyEvent) == 1) {
                    ((pk4) this.f19763c).m9542d(null);
                } else {
                    zM3621g = false;
                }
                return Boolean.valueOf(zM3621g);
            case 5:
                ViewTreeObserver viewTreeObserver = ((Activity) this.f19762b).getWindow().getDecorView().getViewTreeObserver();
                Object obj2 = ((ql3) this.f19763c).f28555a;
                if (obj2 != null) {
                    viewTreeObserver.removeOnWindowFocusChangeListener((ViewTreeObserver.OnWindowFocusChangeListener) obj2);
                    return ju4.f22634a;
                }
                z62.m13366Y("listener");
                throw null;
            case 6:
                lb5.m7910S((zo0) this.f19762b, null, null, new C0594e0(obj, (wm0) null, (sw2) this.f19763c), 3);
                return ju4.f22634a;
            case 7:
                ((yp1) this.f19762b).invoke(ie1.m6771a((ie1) this.f19763c, pb0.m9462a(((pb0) obj).f27503a), null, null, 6));
                return ju4.f22634a;
            case 8:
                i94 i94Var = (i94) obj;
                synchronized (k94.f23012c) {
                    j = k94.f23014e;
                    k94.f23014e = 1 + j;
                }
                return new rw2(j, i94Var, (yp1) this.f19762b, (yp1) this.f19763c);
            case 9:
                Throwable th2 = (Throwable) obj;
                js1 js1Var = (js1) this.f19762b;
                yc2 yc2Var = (yc2) js1Var.f22555a;
                yc2 yc2Var2 = (yc2) this.f19763c;
                if (yc2Var == yc2Var2) {
                    js1Var.f22555a = null;
                }
                b70 b70Var = yc2Var2.f35114b;
                if (b70Var != null) {
                    b70Var.mo115m(th2);
                }
                yc2Var2.f35114b = null;
                return ju4.f22634a;
            case 10:
                C1126rz c1126rz = (C1126rz) this.f19762b;
                Object obj3 = c1126rz.f29738b;
                b70 b70Var2 = (b70) this.f19763c;
                synchronized (obj3) {
                    ((ArrayList) c1126rz.f29740d).remove(b70Var2);
                }
                return ju4.f22634a;
            case 11:
                ((pz2) this.f19762b).f28105b.remove((kr3) this.f19763c);
                return ju4.f22634a;
            case 12:
                sn0 sn0Var = (sn0) obj;
                xx2 xx2Var = (xx2) this.f19763c;
                a44 a44Var = (a44) this.f19762b;
                if (sn0Var == null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(wx2.m12435c(a44Var));
                    linkedHashMap.remove(xx2Var);
                    int size = linkedHashMap.size();
                    if (size == 0) {
                        mapSingletonMap2 = linkedHashMap;
                        mapSingletonMap2 = w71.f33134a;
                    } else if (size == 1) {
                        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                        mapSingletonMap2 = Collections.singletonMap(entry.getKey(), entry.getValue());
                    }
                    tt2 tt2Var = wx2.f33825e;
                    ic2 ic2Var = wx2.f33821a[3];
                    tt2Var.m11144C(a44Var, mapSingletonMap2);
                } else {
                    Map mapM12435c = wx2.m12435c(a44Var);
                    if (mapM12435c.isEmpty()) {
                        mapSingletonMap = Collections.singletonMap(xx2Var, sn0Var);
                    } else {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapM12435c);
                        linkedHashMap2.put(xx2Var, sn0Var);
                        mapSingletonMap = linkedHashMap2;
                    }
                    tt2 tt2Var2 = wx2.f33825e;
                    ic2 ic2Var2 = wx2.f33821a[3];
                    tt2Var2.m11144C(a44Var, mapSingletonMap);
                }
                return ju4.f22634a;
            case 13:
                ((nh4) this.f19762b).getViewTreeObserver().removeOnPreDrawListener((ch4) this.f19763c);
                return ju4.f22634a;
            case 14:
                KeyEvent keyEvent2 = ((sc2) obj).f30158a;
                zk1 zk1Var = (zk1) this.f19762b;
                InputDevice device = keyEvent2.getDevice();
                if (device == null || !device.supportsSource(513) || ((device.isVirtual() && keyEvent2.getSource() != 33554433) || qs5.m10083H(keyEvent2) != 2 || keyEvent2.getSource() == 257)) {
                    zM3621g = false;
                } else if (C0638f5.m5555z(keyEvent2, 19)) {
                    zM3621g = ((bl1) zk1Var).m3621g(5, true);
                } else if (C0638f5.m5555z(keyEvent2, 20)) {
                    zM3621g = ((bl1) zk1Var).m3621g(6, true);
                } else if (C0638f5.m5555z(keyEvent2, 21)) {
                    zM3621g = ((bl1) zk1Var).m3621g(3, true);
                } else if (C0638f5.m5555z(keyEvent2, 22)) {
                    zM3621g = ((bl1) zk1Var).m3621g(4, true);
                } else if (C0638f5.m5555z(keyEvent2, 23)) {
                    ea4 ea4Var = ((uj2) this.f19763c).f31914c;
                    if (ea4Var != null) {
                        ((ay0) ea4Var).m3366b();
                    }
                } else {
                    zM3621g = false;
                }
                return Boolean.valueOf(zM3621g);
            case 15:
                wz4 wz4Var = (wz4) this.f19763c;
                xz4 xz4Var = (xz4) this.f19762b;
                xn2 xn2Var = xz4Var.f34747b;
                if (xn2Var != null) {
                    String strM12721a = xn2Var.m12721a();
                    k44 k44Var = k44.f22883b;
                    if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                        xn2Var.m12722b(k44Var, strM12721a, "cancel " + wz4Var, null);
                    }
                }
                xz4Var.f34750e.remove(wz4Var);
                return ju4.f22634a;
            default:
                Throwable th3 = (Throwable) obj;
                if (th3 instanceof y25) {
                    ((Worker) this.f19762b).f14682c.compareAndSet(-256, ((y25) th3).f34826a);
                }
                ((p60) this.f19763c).cancel(false);
                return ju4.f22634a;
        }
    }

    @Override // p000.j60
    public void onFailure(ek3 ek3Var, IOException iOException) {
        if (ek3Var.f18183m) {
            return;
        }
        ((b70) this.f19763c).resumeWith(k43.m7389n(iOException));
    }

    @Override // p000.j60
    public void onResponse(ek3 ek3Var, xo3 xo3Var) {
        ((b70) this.f19763c).resumeWith(xo3Var);
    }
}
