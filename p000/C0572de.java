package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: de */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0572de implements p56 {

    /* JADX INFO: renamed from: a */
    public Context f16997a;

    /* JADX INFO: renamed from: c */
    public static void m4487c(vt1 vt1Var) {
        if (vt1Var instanceof vt1) {
            vt1Var.f32853b.getClass();
            nm0.m8798k(vt1Var, "GoogleFont only support async loading: ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public Object m4488a(vt1 vt1Var, ym0 ym0Var) {
        C0524ce c0524ce;
        if (ym0Var instanceof C0524ce) {
            c0524ce = (C0524ce) ym0Var;
            int i = c0524ce.f15967v;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0524ce.f15967v = i - Integer.MIN_VALUE;
            } else {
                c0524ce = new C0524ce(this, ym0Var);
            }
        } else {
            c0524ce = new C0524ce(this, ym0Var);
        }
        Object obj = c0524ce.f15965t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = c0524ce.f15967v;
        int i3 = 2;
        byte b = 1;
        if (i2 != 0) {
            if (i2 == 1) {
                k43.m7376J(obj);
                return obj;
            }
            if (i2 != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj);
            throw null;
        }
        k43.m7376J(obj);
        if (!(vt1Var instanceof vt1)) {
            wb1.m12195o(vt1Var, "Unknown font type: ");
            return null;
        }
        gb5 gb5Var = vt1Var.f32853b;
        Context context = this.f16997a;
        c0524ce.f15967v = 1;
        gb5Var.getClass();
        if (!(vt1Var instanceof vt1)) {
            xy4.m12783l("Only GoogleFontImpl supported (actual ", vt1Var, ")");
            return null;
        }
        boolean z = vt1Var.f32857f;
        xm1 xm1Var = vt1Var.f32856e;
        wm1 wm1Var = vt1Var.f32854c;
        boolean z2 = false;
        byte b2 = 0;
        String strM4367l = d55.m4367l("name=Rubik&weight=", xm1Var.f34418a, "&italic=", z ? 1 : 0, "&besteffort=true");
        List list = vt1Var.f32855d.f32154a;
        String strM9081F = oh6.m9081F(wm1Var, context);
        lm1 lm1Var = new lm1();
        lm1Var.f24152a = "com.google.android.gms.fonts";
        lm1Var.f24153b = "com.google.android.gms";
        lm1Var.f24154c = strM4367l;
        list.getClass();
        lm1Var.f24155d = list;
        lm1Var.f24156e = null;
        lm1Var.f24157f = strM9081F;
        StringBuilder sb = new StringBuilder();
        sb.append("com.google.android.gms.fonts");
        sb.append("-");
        sb.append("com.google.android.gms");
        sb.append("-");
        sb.append(strM4367l);
        sb.append("-");
        sb.append((String) null);
        if (strM9081F != null && !strM9081F.isBlank()) {
            sb.append("-VF");
        }
        lm1Var.f24158g = sb.toString();
        VarHandle.storeStoreFence();
        byte b3 = z;
        byte b4 = xm1Var.compareTo(xm1.f34416i) >= 0;
        if (b3 == true && b4 == true) {
            i3 = 3;
        } else if (b3 == false) {
            i3 = b4 != false ? 1 : 0;
        }
        b70 b70Var = new b70(1, C0006a5.m86x(c0524ce));
        b70Var.m3497u();
        jp0 jp0Var = new jp0((byte) 20, z2);
        jp0Var.f22481b = b70Var;
        jp0Var.f22482c = vt1Var;
        jp0Var.f22483d = context;
        VarHandle.storeStoreFence();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handlerCreateAsync = Handler.createAsync(looperMyLooper);
        List listOf = List.of(lm1Var);
        jo3 jo3Var = new jo3((byte) 0);
        handlerCreateAsync.getClass();
        jo3Var.f22472b = handlerCreateAsync;
        VarHandle.storeStoreFence();
        z32 z32Var = new z32((byte) 5);
        z32Var.f35738b = jp0Var;
        z32Var.f35739c = jo3Var;
        VarHandle.storeStoreFence();
        String strM9569a = pm1.m9569a(listOf, i3);
        Typeface typeface = (Typeface) pm1.f27743a.m3648c(strM9569a);
        if (typeface != null) {
            ar1 ar1Var = new ar1(b);
            ar1Var.f14798b = jp0Var;
            ar1Var.f14799c = typeface;
            VarHandle.storeStoreFence();
            jo3Var.execute(ar1Var);
        } else {
            mm1 mm1Var = new mm1(b2 == true ? 1 : 0);
            mm1Var.f25021b = z32Var;
            VarHandle.storeStoreFence();
            synchronized (pm1.f27745c) {
                try {
                    x64 x64Var = pm1.f27746d;
                    ArrayList arrayList = (ArrayList) x64Var.get(strM9569a);
                    if (arrayList != null) {
                        arrayList.add(mm1Var);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(mm1Var);
                        x64Var.put(strM9569a, arrayList2);
                        nm1 nm1Var = new nm1();
                        nm1Var.f25940a = strM9569a;
                        nm1Var.f25941b = context;
                        nm1Var.f25942c = listOf;
                        nm1Var.f25943d = i3;
                        VarHandle.storeStoreFence();
                        ThreadPoolExecutor threadPoolExecutor = pm1.f27744b;
                        mm1 mm1Var2 = new mm1(b);
                        mm1Var2.f25021b = strM9569a;
                        VarHandle.storeStoreFence();
                        Handler handler = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                        yn3 yn3Var = new yn3(b);
                        yn3Var.f35360b = nm1Var;
                        yn3Var.f35361c = mm1Var2;
                        yn3Var.f35362d = handler;
                        threadPoolExecutor.execute(yn3Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Object objM3495r = b70Var.m3495r();
        return objM3495r == ap0Var ? ap0Var : objM3495r;
    }

    /* JADX INFO: renamed from: b */
    public xs0 m4489b() {
        Context context = this.f16997a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        xs0 xs0Var = new xs0();
        xs0Var.f34575a = j11.m6991a(sb1.f30051a);
        w42 w42Var = new w42((byte) 0, (boolean) (0 == true ? 1 : 0));
        w42Var.f33090b = context;
        VarHandle.storeStoreFence();
        xs0Var.f34576b = w42Var;
        js1 js1Var = new js1();
        js1Var.f22555a = w42Var;
        VarHandle.storeStoreFence();
        z32 z32Var = new z32((byte) 20);
        z32Var.f35738b = w42Var;
        z32Var.f35739c = js1Var;
        VarHandle.storeStoreFence();
        xs0Var.f34577c = j11.m6991a(z32Var);
        w42 w42Var2 = xs0Var.f34576b;
        byte b = 1;
        ib1 ib1Var = new ib1(b);
        ib1Var.f21243b = w42Var2;
        VarHandle.storeStoreFence();
        xs0Var.f34578d = ib1Var;
        ib1 ib1Var2 = new ib1(0 == true ? 1 : 0);
        ib1Var2.f21243b = w42Var2;
        VarHandle.storeStoreFence();
        ai3 ai3VarM6991a = j11.m6991a(ib1Var2);
        ib1 ib1Var3 = xs0Var.f34578d;
        an3 an3Var = new an3(b);
        an3Var.f14641b = ib1Var3;
        an3Var.f14642c = ai3VarM6991a;
        VarHandle.storeStoreFence();
        ai3 ai3VarM6991a2 = j11.m6991a(an3Var);
        xs0Var.f34579e = ai3VarM6991a2;
        r50 r50Var = new r50((byte) 17);
        VarHandle.storeStoreFence();
        w42 w42Var3 = xs0Var.f34576b;
        tt2 tt2Var = new tt2((byte) 9, 0 == true ? 1 : 0);
        tt2Var.f31428b = w42Var3;
        tt2Var.f31429c = ai3VarM6991a2;
        tt2Var.f31430d = r50Var;
        VarHandle.storeStoreFence();
        ai3 ai3Var = xs0Var.f34575a;
        ai3 ai3Var2 = xs0Var.f34577c;
        C1122rv c1122rv = new C1122rv((byte) 3, 0 == true ? 1 : 0);
        c1122rv.f29651b = ai3Var;
        c1122rv.f29652c = ai3Var2;
        c1122rv.f29653d = tt2Var;
        c1122rv.f29654e = ai3VarM6991a2;
        c1122rv.f29655f = ai3VarM6991a2;
        VarHandle.storeStoreFence();
        lg0 lg0Var = new lg0();
        lg0Var.f24016a = w42Var3;
        lg0Var.f24017b = ai3Var2;
        lg0Var.f24018c = ai3VarM6991a2;
        lg0Var.f24019d = tt2Var;
        lg0Var.f24020e = ai3Var;
        lg0Var.f24021f = ai3VarM6991a2;
        lg0Var.f24022g = ai3VarM6991a2;
        VarHandle.storeStoreFence();
        C1283w7 c1283w7 = new C1283w7((byte) 25);
        c1283w7.f33127c = ai3Var;
        c1283w7.f33128d = ai3VarM6991a2;
        c1283w7.f33129e = tt2Var;
        c1283w7.f33126b = ai3VarM6991a2;
        VarHandle.storeStoreFence();
        tt2 tt2Var2 = new tt2((byte) 14, 0 == true ? 1 : 0);
        tt2Var2.f31428b = c1122rv;
        tt2Var2.f31429c = lg0Var;
        tt2Var2.f31430d = c1283w7;
        VarHandle.storeStoreFence();
        xs0Var.f34580f = j11.m6991a(tt2Var2);
        return xs0Var;
    }

    @Override // p000.p56
    /* JADX INFO: renamed from: f */
    public Object mo4490f() {
        return gq6.m6075M(this.f16997a, HsdpDeepLinkServiceFactory.createHsdpServiceIntent());
    }
}
