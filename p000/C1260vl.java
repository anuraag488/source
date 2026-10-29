package p000;

import ads_mobile_sdk.AbstractC0137h;
import ads_mobile_sdk.C0155i0;
import ads_mobile_sdk.EnumC0351u;
import ads_mobile_sdk.b63;
import ads_mobile_sdk.f83;
import ads_mobile_sdk.hm1;
import ads_mobile_sdk.sg0;
import ads_mobile_sdk.z01;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: vl */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1260vl extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f32711t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f32712u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f32713v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1260vl(wm0 wm0Var, pz2 pz2Var, kr3 kr3Var) {
        super(2, wm0Var);
        this.f32711t = (byte) 6;
        this.f32712u = pz2Var;
        this.f32713v = kr3Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f32711t;
        Object obj2 = this.f32713v;
        switch (b) {
            case 0:
                C1260vl c1260vl = new C1260vl(obj2, wm0Var, (byte) 0);
                c1260vl.f32712u = obj;
                return c1260vl;
            case 1:
                C1260vl c1260vl2 = new C1260vl(obj2, wm0Var, (byte) 1);
                c1260vl2.f32712u = obj;
                return c1260vl2;
            case 2:
                C1260vl c1260vl3 = new C1260vl(obj2, wm0Var, (byte) 2);
                c1260vl3.f32712u = obj;
                return c1260vl3;
            case 3:
                C1260vl c1260vl4 = new C1260vl(obj2, wm0Var, (byte) 3);
                c1260vl4.f32712u = obj;
                return c1260vl4;
            case 4:
                C1260vl c1260vl5 = new C1260vl(obj2, wm0Var, (byte) 4);
                c1260vl5.f32712u = obj;
                return c1260vl5;
            case 5:
                C1260vl c1260vl6 = new C1260vl(obj2, wm0Var, (byte) 5);
                c1260vl6.f32712u = obj;
                return c1260vl6;
            case 6:
                return new C1260vl(wm0Var, (pz2) this.f32712u, (kr3) obj2);
            case 7:
                C1260vl c1260vl7 = new C1260vl(obj2, wm0Var, (byte) 7);
                c1260vl7.f32712u = obj;
                return c1260vl7;
            case 8:
                C1260vl c1260vl8 = new C1260vl(obj2, wm0Var, (byte) 8);
                c1260vl8.f32712u = obj;
                return c1260vl8;
            case 9:
                C1260vl c1260vl9 = new C1260vl(obj2, wm0Var, (byte) 9);
                c1260vl9.f32712u = obj;
                return c1260vl9;
            case 10:
                return new C1260vl((ArrayList) this.f32712u, (w94) obj2, wm0Var, (byte) 10);
            case 11:
                return new C1260vl((mh0) this.f32712u, (fk2) obj2, wm0Var, (byte) 11);
            case 12:
                C1260vl c1260vl10 = new C1260vl(obj2, wm0Var, (byte) 12);
                c1260vl10.f32712u = obj;
                return c1260vl10;
            case 13:
                return new C1260vl((AccessibilityNodeInfo) this.f32712u, (xn2) obj2, wm0Var, (byte) 13);
            case 14:
                C1260vl c1260vl11 = new C1260vl(obj2, wm0Var, (byte) 14);
                c1260vl11.f32712u = obj;
                return c1260vl11;
            case 15:
                C1260vl c1260vl12 = new C1260vl(obj2, wm0Var, (byte) 15);
                c1260vl12.f32712u = obj;
                return c1260vl12;
            default:
                return new C1260vl((C1060q6) this.f32712u, (InterfaceC1309ww) obj2, wm0Var, (byte) 16);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.f32711t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((C1260vl) create((wm0) obj2, (List) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((C1260vl) create((wm0) obj2, (ApplicationInfo) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((C1260vl) create((wm0) obj2, (C0927mz) obj)).invokeSuspend(ju4Var);
            case 3:
                return ((C1260vl) create((wm0) obj2, obj)).invokeSuspend(ju4Var);
            case 4:
                return ((C1260vl) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 5:
                return ((C1260vl) create((wm0) obj2, (wb4) obj)).invokeSuspend(ju4Var);
            case 6:
                ((C1260vl) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
                return ju4Var;
            case 7:
                ((C1260vl) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
                return ju4Var;
            case 8:
                return ((C1260vl) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 9:
                ((C1260vl) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
                throw null;
            case 10:
                ((C1260vl) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
                return ju4Var;
            case 11:
                ((C1260vl) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
                return ju4Var;
            case 12:
                return ((C1260vl) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 13:
                return ((C1260vl) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 14:
                ((C1260vl) create((wm0) obj2, (hw2) obj)).invokeSuspend(ju4Var);
                return ju4Var;
            case 15:
                return ((C1260vl) create((wm0) obj2, (hw2) obj)).invokeSuspend(ju4Var);
            default:
                new C1260vl((C1060q6) this.f32712u, (InterfaceC1309ww) this.f32713v, (wm0) obj2, (byte) 16).invokeSuspend(ju4Var);
                return ju4Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws Throwable {
        Unsafe unsafe;
        long j;
        int intVolatile;
        byte b = this.f32711t;
        byte b2 = 2;
        byte b3 = 3;
        ju4 ju4Var = ju4.f22634a;
        boolean z = true;
        z = true;
        boolean z2 = true;
        int i = 0;
        byte b4 = 0;
        byte b5 = 0;
        wm0 wm0Var = null;
        Object obj2 = this.f32713v;
        switch (b) {
            case 0:
                List list = (List) this.f32712u;
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                return hb0.m6309U0(list, (C1112rl) obj2);
            case 1:
                ApplicationInfo applicationInfo = (ApplicationInfo) this.f32712u;
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                return new C0766im(applicationInfo.packageName, applicationInfo.loadLabel(((Context) obj2).getPackageManager()).toString());
            case 2:
                C0927mz c0927mz = (C0927mz) this.f32712u;
                ap0 ap0Var3 = ap0.f14763a;
                k43.m7376J(obj);
                return Boolean.valueOf(c0927mz != ((C0927mz) obj2));
            case 3:
                Object obj3 = this.f32712u;
                ap0 ap0Var4 = ap0.f14763a;
                k43.m7376J(obj);
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                while (i < size) {
                    Object obj4 = arrayList.get(i);
                    i++;
                    ((hx0) obj4).mo4993a(null);
                }
                return obj3;
            case 4:
                ap0 ap0Var5 = ap0.f14763a;
                k43.m7376J(obj);
                es0 es0Var = (es0) obj2;
                return Boolean.valueOf(es0Var.f18428b.compareAndSet(null, lb5.m7910S((zo0) this.f32712u, null, null, new C0682gb((t82) es0Var.f18428b.getAndSet(null), es0Var, wm0Var, b3), 3)));
            case 5:
                wb4 wb4Var = (wb4) this.f32712u;
                ap0 ap0Var6 = ap0.f14763a;
                k43.m7376J(obj);
                return Boolean.valueOf((wb4Var instanceof at0) && ((at0) wb4Var).f33220a <= ((at0) ((wb4) obj2)).f33220a);
            case 6:
                ap0 ap0Var7 = ap0.f14763a;
                k43.m7376J(obj);
                ((pz2) this.f32712u).m9690b((kr3) obj2, null);
                return ju4Var;
            case 7:
                zo0 zo0Var = (zo0) this.f32712u;
                ap0 ap0Var8 = ap0.f14763a;
                k43.m7376J(obj);
                l22 l22Var = (l22) obj2;
                lb5.m7910S(zo0Var, null, null, new k22(l22Var, wm0Var, b4 == true ? 1 : 0), 3);
                lb5.m7910S(zo0Var, null, null, new k22(l22Var, wm0Var, z ? (byte) 1 : (byte) 0), 3);
                lb5.m7910S(zo0Var, null, null, new k22(l22Var, wm0Var, b2), 3);
                return ju4Var;
            case 8:
                zo0 zo0Var2 = (zo0) this.f32712u;
                ap0 ap0Var9 = ap0.f14763a;
                k43.m7376J(obj);
                ro0 ro0VarMo6367f = zo0Var2.mo6367f();
                C1053q c1053q = (C1053q) obj2;
                try {
                    im4 im4Var = new im4();
                    im4Var.f21561e = Thread.currentThread();
                    VarHandle.storeStoreFence();
                    im4Var.f21562f = y70.m13005F(y70.m13042w(ro0VarMo6367f), true, im4Var);
                    try {
                        do {
                            unsafe = AbstractC1078qo.f28633a;
                            j = im4.f21560g;
                            intVolatile = unsafe.getIntVolatile(im4Var, j);
                            if (intVolatile != 0) {
                                if (intVolatile != 2 && intVolatile != 3) {
                                    im4.m6818q(intVolatile);
                                    throw null;
                                }
                            }
                            return c1053q.invoke();
                        } while (!unsafe.compareAndSwapInt(im4Var, j, intVolatile, 0));
                        return c1053q.invoke();
                    } finally {
                        im4Var.m6819p();
                    }
                } catch (InterruptedException e) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
                }
            case 9:
                ap0 ap0Var10 = ap0.f14763a;
                k43.m7376J(obj);
                throw null;
            case 10:
                ap0 ap0Var11 = ap0.f14763a;
                k43.m7376J(obj);
                ArrayList arrayList2 = (ArrayList) this.f32712u;
                w94 w94Var = (w94) obj2;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    xz2 xz2Var = (xz2) arrayList2.get(i2);
                    AbstractC0003a2 abstractC0003a2M12171e = w94Var.m12171e();
                    ArrayList arrayList3 = new ArrayList(abstractC0003a2M12171e.mo103a());
                    int iMo103a = abstractC0003a2M12171e.mo103a();
                    for (int i3 = 0; i3 < iMo103a; i3++) {
                        arrayList3.add(((xz2) abstractC0003a2M12171e.get(i3)).f34736a);
                    }
                    if (!arrayList3.contains(xz2Var.f34736a)) {
                        w94Var.add(xz2Var);
                    }
                }
                return ju4Var;
            case 11:
                ap0 ap0Var12 = ap0.f14763a;
                k43.m7376J(obj);
                mh0 mh0Var = (mh0) this.f32712u;
                mh0Var.f24912c = (fk2) obj2;
                mh0Var.m8322a();
                return ju4Var;
            case 12:
                ap0 ap0Var13 = ap0.f14763a;
                k43.m7376J(obj);
                so0 so0Var = (so0) ((zo0) this.f32712u).mo6367f().get(gb5.f19711b);
                cf0 cf0Var = new cf0();
                lb5.m7909R(ps1.f27931a, so0Var, cp0.f16328d, new er2((Object) cf0Var, obj2, wm0Var, (byte) 9));
                while (!cf0Var.mo4971B()) {
                    try {
                        return y70.m13014O(so0Var, new ht3(cf0Var, wm0Var, b5 == true ? 1 : 0));
                    } catch (InterruptedException unused) {
                    }
                }
                return cf0Var.m4977I();
            case 13:
                ap0 ap0Var14 = ap0.f14763a;
                k43.m7376J(obj);
                AccessibilityNodeInfo accessibilityNodeInfo = (AccessibilityNodeInfo) this.f32712u;
                xn2 xn2Var = (xn2) obj2;
                int i4 = ox3.f27193g;
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                long jWidth = (long) (((long) rect.width()) * ((long) rect.height()) * 0.15f);
                if (xn2Var != null) {
                    String strM12721a = xn2Var.m12721a();
                    k44 k44Var = k44.f22883b;
                    if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                        xn2Var.m12722b(k44Var, strM12721a, "candidates: windowBounds=" + rect + " minArea=" + jWidth, null);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                ox3.m9323b(xn2Var, rect, jWidth, arrayList4, accessibilityNodeInfo, 0, false);
                return hb0.m6315a1(hb0.m6315a1(arrayList4, new vl1((byte) 19)), new vl1((byte) 20));
            case 14:
                ap0 ap0Var15 = ap0.f14763a;
                k43.m7376J(obj);
                ((hw2) this.f32712u).m6527e(y70.f34988s, (String) obj2);
                return ju4Var;
            case 15:
                hw2 hw2Var = (hw2) this.f32712u;
                ap0 ap0Var16 = ap0.f14763a;
                k43.m7376J(obj);
                Set setKeySet = hw2Var.m6523a().keySet();
                ArrayList arrayList5 = new ArrayList(ib0.m6717y0(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList5.add(((xd3) it.next()).f34170a);
                }
                Set set = (Set) obj2;
                if (set != g54.f19620a) {
                    Set set2 = set;
                    if ((set2 instanceof Collection) && set2.isEmpty()) {
                        z2 = false;
                    } else {
                        Iterator it2 = set2.iterator();
                        while (it2.hasNext()) {
                            if (!arrayList5.contains((String) it2.next())) {
                            }
                        }
                        z2 = false;
                    }
                }
                return Boolean.valueOf(z2);
            default:
                ap0 ap0Var17 = ap0.f14763a;
                k43.m7376J(obj);
                C1060q6 c1060q6 = (C1060q6) this.f32712u;
                InterfaceC1309ww interfaceC1309ww = (InterfaceC1309ww) obj2;
                int i5 = C1060q6.f28231d;
                Context context = c1060q6.getContext();
                Activity activity = context instanceof Activity ? (Activity) context : null;
                c1060q6.removeAllViews();
                c1060q6.f28232a = interfaceC1309ww;
                b63 b63Var = (b63) interfaceC1309ww;
                f83 f83Var = b63Var.f1022c;
                c1060q6.f28233b = ((hm1) b63Var.f1023e.f7510u.m2617a("The backing field has not yet been initialized.")).m1173l();
                c1060q6.m9744b();
                if (activity != null) {
                    x45.f33989a.getClass();
                    ((C0155i0) ((sg0) z01.m2787a()).f11299G.get()).m1243a(activity, EnumC0351u.f12135e);
                }
                ViewParent parent = f83Var.getParent();
                if (parent instanceof ViewGroup) {
                    AbstractC0137h.m1115c("Banner view provided from " + ((zh0) interfaceC1309ww).mo464a().getResponseInfo().m13206b() + " already has a parent view. Removing its old parent.", null);
                    ((ViewGroup) parent).removeView(f83Var);
                }
                c1060q6.addView(f83Var);
                return ju4Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1260vl(Object obj, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f32711t = b;
        this.f32713v = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1260vl(Object obj, Object obj2, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f32711t = b;
        this.f32712u = obj;
        this.f32713v = obj2;
    }
}
