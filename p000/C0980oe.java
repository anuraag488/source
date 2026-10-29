package p000;

import ads_mobile_sdk.AbstractC0137h;
import ads_mobile_sdk.C0132ga;
import ads_mobile_sdk.C0200km;
import ads_mobile_sdk.C0213l2;
import ads_mobile_sdk.b11;
import ads_mobile_sdk.cy3;
import ads_mobile_sdk.dd3;
import ads_mobile_sdk.e83;
import ads_mobile_sdk.ff3;
import ads_mobile_sdk.i04;
import ads_mobile_sdk.i11;
import ads_mobile_sdk.i51;
import ads_mobile_sdk.j11;
import ads_mobile_sdk.j31;
import ads_mobile_sdk.ln1;
import ads_mobile_sdk.ls1;
import ads_mobile_sdk.mx3;
import ads_mobile_sdk.pm1;
import ads_mobile_sdk.pn2;
import ads_mobile_sdk.q11;
import ads_mobile_sdk.q12;
import ads_mobile_sdk.s21;
import ads_mobile_sdk.sy3;
import ads_mobile_sdk.uh3;
import ads_mobile_sdk.w01;
import ads_mobile_sdk.w11;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.Window;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: oe */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0980oe extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f26644t;

    /* JADX INFO: renamed from: u */
    public boolean f26645u;

    /* JADX INFO: renamed from: v */
    public Object f26646v;

    /* JADX INFO: renamed from: w */
    public Object f26647w;

    /* JADX INFO: renamed from: x */
    public Object f26648x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f26649y;

    /* JADX INFO: renamed from: z */
    public Object f26650z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0980oe(wm0 wm0Var, mq1 mq1Var, i64 i64Var, yp1 yp1Var, Context context, yp1 yp1Var2) {
        super(2, wm0Var);
        this.f26644t = (byte) 8;
        this.f26646v = mq1Var;
        this.f26647w = i64Var;
        this.f26648x = yp1Var;
        this.f26649y = context;
        this.f26650z = yp1Var2;
    }

    private final Object invokeSuspend$ads_mobile_sdk$ge3(Object obj) throws Throwable {
        Object j11Var;
        i82 i82Var;
        Throwable th;
        i82 i82Var2;
        i82 i82Var3;
        Throwable th2;
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f26645u;
        pm1 pm1Var = null;
        boolean z2 = false;
        if (!z) {
            k43.m7376J(obj);
            ff3 ff3Var = (ff3) this.f26647w;
            m82 m82Var = (m82) this.f26648x;
            List list = ff3.f3460P;
            s21 s21Var = s21.f11108j1;
            WeakHashMap weakHashMap = cy3.f2323a;
            mx3 mx3VarM655a = cy3.m655a(s21Var, v71.f32439a, true);
            try {
                try {
                    r50 r50Var = i41.f21117b;
                    long jM3238Q = as4.m3238Q(1, m41.HOURS);
                    gd5 gd5Var = ff3Var.f3484l;
                    ls1 ls1Var = new ls1();
                    ls1Var.f6993a = jM3238Q;
                    ls1Var.f6994b = gd5Var;
                    VarHandle.storeStoreFence();
                    i82 i82VarM8222b = m82Var.m8222b();
                    yt2 yt2Var = ff3Var.f3473a.f7461g;
                    i85 i85Var = new i85();
                    i85Var.f21177a = ff3Var;
                    i85Var.f21178b = i82VarM8222b;
                    VarHandle.storeStoreFence();
                    synchronized (i82VarM8222b.f21167a) {
                        i82VarM8222b.f21170d.mo3142j(yt2Var, i85Var);
                    }
                    if (m82Var.f24732i.contains("JS_FEATURE_CONSOLE_MESSAGING")) {
                        C1163sz c1163sz = new C1163sz((byte) 19);
                        c1163sz.f30676b = ff3Var;
                        c1163sz.f30677c = ls1Var;
                        VarHandle.storeStoreFence();
                        synchronized (i82VarM8222b.f21167a) {
                            i82VarM8222b.f21170d.mo3136d(i82VarM8222b.f21169c.f24728e.getMainExecutor(), c1163sz);
                        }
                    }
                    j11Var = new q11(i82VarM8222b);
                } catch (Throwable th3) {
                    try {
                        mx3VarM655a.m1736b(th3);
                        if (th3 instanceof ka5) {
                            throw th3;
                        }
                        if (!(th3 instanceof zm4) && !(th3 instanceof CancellationException)) {
                            mx3VarM655a.m1735a(th3);
                        }
                        if (th3 instanceof zm4) {
                            throw new j31(th3);
                        }
                        if (th3 instanceof CancellationException) {
                            throw new w01(th3);
                        }
                        if (th3 instanceof w11) {
                            throw th3;
                        }
                        throw new b11(th3);
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            lb5.m7941v(mx3VarM655a, th4);
                            throw th5;
                        }
                    }
                }
            } catch (Throwable th6) {
                AbstractC0137h.m1108a("Failed to create isolate", th6);
                ff3Var.f3496x.set(true);
                j11Var = new j11(th6, pm1Var, z2 ? 1 : 0, 6);
            }
            if (j11Var instanceof i11) {
                sy3.m2306a((i11) j11Var, false);
            }
            mx3VarM655a.close();
            if (!(j11Var instanceof q11)) {
                if (j11Var instanceof i11) {
                    return ju4.f22634a;
                }
                C0670g.m5864c();
                return null;
            }
            i82Var = (i82) ((q11) j11Var).f8791b;
            try {
                ff3 ff3Var2 = (ff3) this.f26647w;
                String str = ((dd3) this.f26649y).f2481a;
                this.f26646v = i82Var;
                this.f26645u = true;
                Object objM917a = ff3Var2.m917a(i82Var, str, this);
                if (objM917a == ap0Var) {
                    return ap0Var;
                }
                i82Var2 = i82Var;
                obj = objM917a;
            } catch (Throwable th7) {
                th = th7;
                i82Var.close();
                throw th;
            }
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i82Var3 = (i82) this.f26646v;
            try {
                k43.m7376J(obj);
                i82Var2 = i82Var3;
            } catch (Throwable th8) {
                th2 = th8;
                th = th2;
                i82Var = i82Var3;
                i82Var.close();
                throw th;
            }
        }
        try {
            mi5 mi5Var = (mi5) obj;
            if (mi5Var instanceof q11) {
                ((ff3) this.f26647w).f3466F.add(i82Var2);
                ff3 ff3Var3 = (ff3) this.f26647w;
                ff3Var3.f3469I.put(i82Var2, new Integer(ff3Var3.f3468H.get()));
                ((ff3) this.f26647w).f3465E.incrementAndGet();
                ArrayList arrayList = (ArrayList) this.f26650z;
                synchronized (arrayList) {
                    arrayList.add(i82Var2);
                }
                ff3 ff3Var4 = (ff3) this.f26647w;
                sy3.m2303a(ff3Var4.f3480h, (t82) null, new c00(ff3Var4, i82Var2, (C0200km) ff3Var4.f3489q.get(), (C0200km) ff3Var4.f3490r.get(), (C0132ga) ff3Var4.f3491s.get(), null, (byte) 1), 3);
            } else if (mi5Var instanceof i11) {
                i82Var2.close();
            }
            return ju4.f22634a;
        } catch (Throwable th9) {
            th2 = th9;
            i82Var3 = i82Var2;
            th = th2;
            i82Var = i82Var3;
            i82Var.close();
            throw th;
        }
    }

    private final Object invokeSuspend$ads_mobile_sdk$nn2(Object obj) {
        pn2 pn2Var;
        gx2 gx2Var;
        l73 l73Var;
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f26645u;
        if (!z) {
            k43.m7376J(obj);
            pn2Var = (pn2) this.f26649y;
            gx2 gx2Var2 = pn2Var.f8703m;
            l73 l73Var2 = (l73) this.f26650z;
            this.f26646v = gx2Var2;
            this.f26647w = pn2Var;
            this.f26648x = l73Var2;
            this.f26645u = true;
            if (gx2Var2.m6191e(this) == ap0Var) {
                return ap0Var;
            }
            gx2Var = gx2Var2;
            l73Var = l73Var2;
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l73Var = (l73) this.f26648x;
            pn2Var = (pn2) this.f26647w;
            gx2Var = (gx2) this.f26646v;
            k43.m7376J(obj);
        }
        try {
            return Boolean.valueOf(pn2Var.f8704n.remove(l73Var));
        } finally {
            gx2Var.m6193g(null);
        }
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f26644t;
        Object obj2 = this.f26649y;
        switch (b) {
            case 0:
                C0980oe c0980oe = new C0980oe(this.f26647w, this.f26648x, obj2, this.f26650z, wm0Var, (byte) 0);
                c0980oe.f26646v = obj;
                return c0980oe;
            case 1:
                return new C0980oe((dz0) this.f26646v, (sw2) this.f26647w, (sw2) this.f26648x, (xb4) obj2, (xn2) this.f26650z, wm0Var, (byte) 1);
            case 2:
                C0980oe c0980oe2 = new C0980oe(this.f26648x, obj2, this.f26650z, wm0Var, (byte) 2);
                c0980oe2.f26646v = obj;
                return c0980oe2;
            case 3:
                return new C0980oe((d00) this.f26646v, (xn2) this.f26647w, (C1349xz) this.f26648x, (og3) obj2, (Activity) this.f26650z, wm0Var, (byte) 3);
            case 4:
                return new C0980oe((uj2) this.f26646v, (sw2) this.f26647w, (bl4) this.f26648x, (pk4) obj2, (l12) this.f26650z, wm0Var, (byte) 4);
            case 5:
                return new C0980oe((e30) this.f26646v, (xk4) this.f26647w, (uj2) this.f26648x, (kl4) obj2, (vi3) this.f26650z, wm0Var, (byte) 5);
            case 6:
                return new C0980oe((b12) this.f26646v, (lk3) this.f26647w, (g74) this.f26648x, (za1) obj2, (Bitmap) this.f26650z, wm0Var, (byte) 6);
            case 7:
                C0980oe c0980oe3 = new C0980oe(this.f26648x, obj2, this.f26650z, wm0Var, (byte) 7);
                c0980oe3.f26646v = obj;
                return c0980oe3;
            case 8:
                return new C0980oe(wm0Var, (mq1) this.f26646v, (i64) this.f26647w, (yp1) this.f26648x, (Context) obj2, (yp1) this.f26650z);
            case 9:
                return new C0980oe((pc3) this.f26646v, (nv2) this.f26647w, (k84) this.f26648x, (sw2) obj2, (sw2) this.f26650z, wm0Var, (byte) 9);
            case 10:
                C0980oe c0980oe4 = new C0980oe(this.f26647w, this.f26648x, obj2, this.f26650z, wm0Var, (byte) 10);
                c0980oe4.f26646v = obj;
                return c0980oe4;
            case 11:
                C0980oe c0980oe5 = new C0980oe(this.f26648x, obj2, this.f26650z, wm0Var, (byte) 11);
                c0980oe5.f26646v = obj;
                return c0980oe5;
            case 12:
                return new C0980oe(this.f26646v, wm0Var, (pn0) this.f26647w, (yp1) this.f26648x, (wp1) obj2);
            case 13:
                C0980oe c0980oe6 = new C0980oe(this.f26647w, this.f26648x, obj2, this.f26650z, wm0Var, (byte) 13);
                c0980oe6.f26646v = obj;
                return c0980oe6;
            case 14:
                return new C0980oe((i04) this.f26646v, (i51) this.f26647w, (String) this.f26648x, (String) obj2, (String) this.f26650z, wm0Var, (byte) 14);
            case 15:
                return new C0980oe(this.f26647w, this.f26648x, obj2, this.f26650z, wm0Var, (byte) 15);
            case 16:
                return new C0980oe((String) this.f26646v, (ua5) this.f26647w, wm0Var, (uh3) this.f26648x, (C0213l2) obj2, (yo3) this.f26650z);
            case 17:
                return new C0980oe((pn2) obj2, (l73) this.f26650z, wm0Var);
            case 18:
                return new C0980oe((q12) this.f26646v, (ViewGroup) this.f26647w, (e83) this.f26648x, (Activity) obj2, (Window) this.f26650z, wm0Var, (byte) 18);
            default:
                return new C0980oe(this.f26648x, obj2, this.f26650z, wm0Var, (byte) 19);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.f26644t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                ((C0980oe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
                return ap0.f14763a;
            case 1:
                return ((C0980oe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((C0980oe) create((wm0) obj2, (C0927mz) obj)).invokeSuspend(ju4Var);
            case 3:
                return ((C0980oe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 4:
                return ((C0980oe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 5:
                return ((C0980oe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 6:
                return ((C0980oe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 7:
                return ((C0980oe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 8:
                return ((C0980oe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 9:
                return ((C0980oe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 10:
                return ((C0980oe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 11:
                return ((C0980oe) create((wm0) obj2, (ty3) obj)).invokeSuspend(ju4Var);
            case 12:
                return ((C0980oe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 13:
                return ((C0980oe) create((wm0) obj2, (ln1) obj)).invokeSuspend(ju4Var);
            case 14:
                return ((C0980oe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 15:
                return ((C0980oe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 16:
                return ((C0980oe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 17:
                return new C0980oe((pn2) this.f26649y, (l73) this.f26650z, (wm0) obj2).invokeSuspend(ju4Var);
            case 18:
                return ((C0980oe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                return ((C0980oe) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x031f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0334  */
    /* JADX WARN: Code duplicated, block: B:149:0x0337  */
    /* JADX WARN: Code duplicated, block: B:152:0x0370  */
    /* JADX WARN: Code duplicated, block: B:245:0x058a A[Catch: all -> 0x05b5, TryCatch #1 {all -> 0x05b5, blocks: (B:239:0x0574, B:240:0x057a, B:242:0x057f, B:243:0x0580, B:245:0x058a, B:247:0x0598, B:249:0x059e, B:252:0x05a4, B:254:0x05a8, B:255:0x05ac, B:256:0x05af, B:260:0x05b7, B:285:0x0617, B:286:0x0618, B:241:0x057b), top: B:462:0x0574, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:247:0x0598 A[Catch: all -> 0x05b5, TryCatch #1 {all -> 0x05b5, blocks: (B:239:0x0574, B:240:0x057a, B:242:0x057f, B:243:0x0580, B:245:0x058a, B:247:0x0598, B:249:0x059e, B:252:0x05a4, B:254:0x05a8, B:255:0x05ac, B:256:0x05af, B:260:0x05b7, B:285:0x0617, B:286:0x0618, B:241:0x057b), top: B:462:0x0574, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:249:0x059e A[Catch: all -> 0x05b5, TryCatch #1 {all -> 0x05b5, blocks: (B:239:0x0574, B:240:0x057a, B:242:0x057f, B:243:0x0580, B:245:0x058a, B:247:0x0598, B:249:0x059e, B:252:0x05a4, B:254:0x05a8, B:255:0x05ac, B:256:0x05af, B:260:0x05b7, B:285:0x0617, B:286:0x0618, B:241:0x057b), top: B:462:0x0574, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:250:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:262:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:263:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:268:0x05e3 A[Catch: all -> 0x05e7, TryCatch #5 {all -> 0x05e7, blocks: (B:266:0x05df, B:268:0x05e3, B:271:0x05e9, B:273:0x05ef), top: B:468:0x05df }] */
    /* JADX WARN: Code duplicated, block: B:273:0x05ef A[Catch: all -> 0x05e7, TRY_LEAVE, TryCatch #5 {all -> 0x05e7, blocks: (B:266:0x05df, B:268:0x05e3, B:271:0x05e9, B:273:0x05ef), top: B:468:0x05df }] */
    /* JADX WARN: Code duplicated, block: B:278:0x060b  */
    /* JADX WARN: Code duplicated, block: B:409:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:412:0x08c7  */
    /* JADX WARN: Code duplicated, block: B:417:0x08de  */
    /* JADX WARN: Code duplicated, block: B:420:0x08e5  */
    /* JADX WARN: Code duplicated, block: B:422:0x08f7  */
    /* JADX WARN: Code duplicated, block: B:463:0x057b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:0x05df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x0611 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x08d9 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:149:0x0337 -> B:150:0x0339). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0980oe.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0980oe(Object obj, wm0 wm0Var, pn0 pn0Var, yp1 yp1Var, wp1 wp1Var) {
        super(2, wm0Var);
        this.f26644t = (byte) 12;
        this.f26646v = obj;
        this.f26647w = pn0Var;
        this.f26648x = yp1Var;
        this.f26649y = wp1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0980oe(Object obj, Object obj2, Object obj3, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f26644t = b;
        this.f26648x = obj;
        this.f26649y = obj2;
        this.f26650z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0980oe(Object obj, Object obj2, Object obj3, Object obj4, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f26644t = b;
        this.f26647w = obj;
        this.f26648x = obj2;
        this.f26649y = obj3;
        this.f26650z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0980oe(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f26644t = b;
        this.f26646v = obj;
        this.f26647w = obj2;
        this.f26648x = obj3;
        this.f26649y = obj4;
        this.f26650z = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0980oe(pn2 pn2Var, l73 l73Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f26644t = (byte) 17;
        this.f26649y = pn2Var;
        this.f26650z = l73Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0980oe(String str, ua5 ua5Var, wm0 wm0Var, uh3 uh3Var, C0213l2 c0213l2, yo3 yo3Var) {
        super(2, wm0Var);
        this.f26644t = (byte) 16;
        this.f26646v = str;
        this.f26647w = ua5Var;
        this.f26648x = uh3Var;
        this.f26649y = c0213l2;
        this.f26650z = yo3Var;
    }
}
