package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.view.View;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.invoke.VarHandle;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: s */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1127s implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f29777a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f29778b;

    public /* synthetic */ C1127s(byte b) {
        this.f29777a = b;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x035d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
        o00 o00Var;
        int i;
        u02 u02Var;
        u02 u02Var2;
        C0489bf c0489bf;
        C0759ie c0759ieM13873h;
        C1325xb c1325xb;
        j70 j70Var;
        jp0 jp0Var;
        float f;
        float f2;
        long jM7219E;
        byte b = this.f29777a;
        byte b2 = 2;
        byte b3 = 3;
        wm0 wm0Var = null;
        byte b4 = 0;
        boolean z = true;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                C0950nl c0950nl = (C0950nl) this.f29778b;
                C0965o c0965o = new C0965o((byte) 0);
                c0965o.f26228b = c0950nl;
                VarHandle.storeStoreFence();
                ((kz3) obj).m7753a(null, new pg0(-512080975, true, c0965o));
                return ju4Var;
            case 1:
                return obj == ((AbstractC0929n0) this.f29778b) ? "(this Collection)" : String.valueOf(obj);
            case 2:
                ib2 ib2Var = (ib2) this.f29778b;
                ib2Var.mo6725J((String) hb0.m6306R0(ib2Var.f21244a), (aa2) obj);
                return ju4Var;
            case 3:
                ha3 ha3Var = (ha3) this.f29778b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                StringBuilder sb = new StringBuilder(key == ha3Var ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != ha3Var ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 4:
                C1357y6 c1357y6 = (C1357y6) this.f29778b;
                c1357y6.f34918q.invoke((bj4) obj, sj3.m10825u(c1357y6, AndroidCompositionLocals_androidKt.f14651b));
                return ju4Var;
            case 5:
                xf2 xf2Var = (xf2) this.f29778b;
                InterfaceC0718ha interfaceC0718ha = (InterfaceC0718ha) obj;
                if (interfaceC0718ha.mo6283X() != Integer.MAX_VALUE) {
                    if (interfaceC0718ha.mo6285a().f34226b) {
                        interfaceC0718ha.mo6282B();
                    }
                    for (Map.Entry entry2 : interfaceC0718ha.mo6285a().f34233i.entrySet()) {
                        xf2Var.m12686a((AbstractC0568da) entry2.getKey(), ((Number) entry2.getValue()).intValue(), interfaceC0718ha.mo6286u());
                    }
                    for (e13 e13Var = interfaceC0718ha.mo6286u().f17629y; !e13Var.equals(xf2Var.f34225a.mo6286u()); e13Var = e13Var.f17629y) {
                        for (AbstractC0568da abstractC0568da : xf2Var.m12687b(e13Var).keySet()) {
                            xf2Var.m12686a(abstractC0568da, xf2Var.m12688c(e13Var, abstractC0568da), e13Var);
                        }
                    }
                }
                return ju4Var;
            case 6:
                return Boolean.valueOf(((sl1) obj).m10861W0(((mk1) this.f29778b).f24973a));
            case 7:
                ro2 ro2Var = (ro2) obj;
                ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = ((C0867lc) this.f29778b).f23928p;
                if (viewTreeObserverOnGlobalLayoutListenerC1140sc.getInsetsListener().f22001f.m132h() > 0) {
                    lv2 lv2Var = c15.f15756a;
                    ro2Var.f29473a = true;
                    so2 so2Var = ro2Var.f29476d;
                    cf2 cf2VarMo4852C0 = so2Var.mo4852C0();
                    if (o52.m8956c(ro2Var.f29474b, 9223372034707292159L)) {
                        ro2Var.f29474b = y42.m12827F0(cf2VarMo4852C0.mo4007b(0L));
                        ro2Var.f29475c = cf2VarMo4852C0.mo4004R();
                    }
                    so2Var.mo4854E0().f33300H.m2983b();
                    long jMo4004R = cf2VarMo4852C0.mo4004R();
                    lw2 lw2Var = viewTreeObserverOnGlobalLayoutListenerC1140sc.getInsetsListener().f22000e;
                    int i2 = (int) (jMo4004R >> 32);
                    int i3 = (int) (jMo4004R & 4294967295L);
                    for (a15 a15Var : c15.f15757b) {
                        p15 p15Var = (p15) lw2Var.m8132g(a15Var);
                        c15.m3795a(ro2Var, ((b15) a15Var).f15029c, p15Var.f27302h, i2, i3);
                        if (((Boolean) p15Var.f27296b.getValue()).booleanValue()) {
                            c15.m3795a(ro2Var, p15Var.f27300f, p15Var.f27304j, i2, i3);
                            c15.m3795a(ro2Var, p15Var.f27301g, p15Var.f27305k, i2, i3);
                        }
                        c15.m3795a(ro2Var, ((b15) a15Var).f15030d, p15Var.f27303i, i2, i3);
                    }
                    cw2 cw2Var = viewTreeObserverOnGlobalLayoutListenerC1140sc.getInsetsListener().f22002g;
                    if (cw2Var.m4209j()) {
                        w94 w94Var = viewTreeObserverOnGlobalLayoutListenerC1140sc.getInsetsListener().f22003h;
                        Object[] objArr = cw2Var.f16532a;
                        int i4 = cw2Var.f16533b;
                        for (int i5 = 0; i5 < i4; i5++) {
                            sw2 sw2Var = (sw2) objArr[i5];
                            x32 x32Var = (x32) w94Var.get(i5);
                            Rect rect = (Rect) sw2Var.getValue();
                            ro2Var.m10383a(x32Var.m12467b(), rect.left);
                            ro2Var.m10383a(x32Var.m12469d(), rect.top);
                            ro2Var.m10383a(x32Var.m12468c(), rect.right);
                            ro2Var.m10383a(x32Var.m12466a(), rect.bottom);
                        }
                    }
                }
                return ju4Var;
            case 8:
                return Boolean.valueOf(((m52) this.f29778b).m8196a(((i14) obj).f21014f));
            case 9:
                return Boolean.valueOf(vd6.m11820D((i14) obj, (Resources) this.f29778b));
            case 10:
                ((q14) obj).mo4898a(z04.f35677a, new y04(uu1.f32175a, ((c33) this.f29778b).mo3840a(), x04.f33901b, true));
                return ju4Var;
            case 11:
                ((wf2) this.f29778b).m12272b0((ky0) obj);
                return ju4Var;
            case 12:
                ag1 ag1Var = (ag1) this.f29778b;
                km0 km0Var = new km0(k91.m7438c(qq2.m10016K(300, 0, null, 6), 2).m9439a(new p91(new cp4((xc1) null, new t74(new j91(new C0891m((byte) 23), z ? 1 : 0), ag1Var), (z70) null, (rv3) null, (LinkedHashMap) null, 125))), new mc1(new cp4((xc1) null, new t74(new j91(new C0891m((byte) 24), b3), ag1Var), (z70) null, (rv3) null, (LinkedHashMap) null, 125)).m8273a(k91.m7439d(qq2.m10016K(200, 0, null, 6), 2)));
                km0Var.f23230c.m13400i(10.0f);
                return km0Var;
            case 13:
                a91 a91Var = (a91) this.f29778b;
                float fFloatValue = ((Float) obj).floatValue();
                ho4 ho4Var = a91Var.f176a;
                ho4Var.m6465b(ho4Var.f20759d.m13399h() + fFloatValue);
                return ju4Var;
            case 14:
                return xl4.m12708a((xl4) obj, 0L, 0L, null, (bm1) this.f29778b, 0L, 0L, null, 16777183);
            case 15:
                return Boolean.valueOf(z62.m13387o(((ny2) obj).f26195b, ((ny2) this.f29778b).f26195b));
            case 16:
                C0705gy c0705gy = (C0705gy) this.f29778b;
                C1032pf c1032pf = new C1032pf(b2);
                c1032pf.f27570b = c0705gy;
                VarHandle.storeStoreFence();
                return c1032pf;
            case 17:
                co4 co4Var = (co4) this.f29778b;
                C1032pf c1032pf2 = new C1032pf(b3);
                c1032pf2.f27570b = co4Var;
                VarHandle.storeStoreFence();
                return c1032pf2;
            case 18:
                a83 a83Var = ((C1349xz) this.f29778b).f34729c;
                a83Var.m133i(a83Var.m132h() + 1);
                C1237uz c1237uz = new C1237uz();
                VarHandle.storeStoreFence();
                return c1237uz;
            case 19:
                f10 f10Var = (f10) this.f29778b;
                z50 z50Var = (z50) obj;
                if (z50Var.mo3580c() * f10Var.f18644r < 0.0f || h74.m6272d(z50Var.f35750a.mo8940d()) <= 0.0f) {
                    return z50Var.m13338a(new C0499bp((byte) 4));
                }
                float fMin = Math.min(p11.m9352c(f10Var.f18644r, 0.0f) ? 1.0f : (float) Math.ceil(z50Var.mo3580c() * f10Var.f18644r), (float) Math.ceil(h74.m6272d(z50Var.f35750a.mo8940d()) / 2.0f));
                float f3 = fMin / 2.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (z50Var.f35750a.mo8940d() >> 32)) - fMin)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (z50Var.f35750a.mo8940d() & 4294967295L)) - fMin)) & 4294967295L);
                float f4 = fMin * 2.0f;
                boolean z2 = f4 > h74.m6272d(z50Var.f35750a.mo8940d());
                lb5 lb5VarMo5797a = f10Var.f18646t.mo5797a(z50Var.f35750a.mo8940d(), z50Var.f35750a.getLayoutDirection(), z50Var);
                if (!(lb5VarMo5797a instanceof g63)) {
                    if (!(lb5VarMo5797a instanceof i63)) {
                        if (!(lb5VarMo5797a instanceof h63)) {
                            C0670g.m5864c();
                            return null;
                        }
                        ga4 ga4Var = f10Var.f18645s;
                        if (z2) {
                            jFloatToRawIntBits = 0;
                        }
                        if (z2) {
                            jFloatToRawIntBits2 = z50Var.f35750a.mo8940d();
                        }
                        qq2 pd4Var = z2 ? uf1.f31820j : new pd4(fMin, 0.0f, 0, 0, 30);
                        c10 c10Var = new c10();
                        c10Var.f15748a = ga4Var;
                        c10Var.f15749b = jFloatToRawIntBits;
                        c10Var.f15750c = jFloatToRawIntBits2;
                        c10Var.f15751d = pd4Var;
                        VarHandle.storeStoreFence();
                        return z50Var.m13338a(c10Var);
                    }
                    ga4 ga4Var2 = f10Var.f18645s;
                    cr3 cr3Var = ((i63) lb5VarMo5797a).f21139o;
                    boolean zM5522A = C0638f5.m5522A(cr3Var);
                    long j = cr3Var.f16395e;
                    if (zM5522A) {
                        pd4 pd4Var2 = new pd4(fMin, 0.0f, 0, 0, 30);
                        d10 d10Var = new d10();
                        d10Var.f16692a = z2;
                        d10Var.f16693b = ga4Var2;
                        d10Var.f16694c = j;
                        d10Var.f16695d = f3;
                        d10Var.f16696e = fMin;
                        d10Var.f16697f = jFloatToRawIntBits;
                        d10Var.f16698g = jFloatToRawIntBits2;
                        d10Var.f16699h = pd4Var2;
                        VarHandle.storeStoreFence();
                        return z50Var.m13338a(d10Var);
                    }
                    b10 b10Var = f10Var.f18643q;
                    if (b10Var == null) {
                        b10Var = new b10();
                        f10Var.f18643q = b10Var;
                    }
                    C0489bf c0489bfM4495a = b10Var.f14992d;
                    if (c0489bfM4495a == null) {
                        c0489bfM4495a = AbstractC0573df.m4495a();
                        b10Var.f14992d = c0489bfM4495a;
                    }
                    c0489bfM4495a.m3564g();
                    C0489bf.m3559b(c0489bfM4495a, cr3Var);
                    if (!z2) {
                        C0489bf c0489bfM4495a2 = AbstractC0573df.m4495a();
                        C0489bf.m3559b(c0489bfM4495a2, new cr3(fMin, fMin, cr3Var.m4144b() - fMin, cr3Var.m4143a() - fMin, k43.m7370D(j, fMin), k43.m7370D(cr3Var.f16396f, fMin), k43.m7370D(cr3Var.f16397g, fMin), k43.m7370D(cr3Var.f16398h, fMin)));
                        c0489bfM4495a.m3563f(c0489bfM4495a, c0489bfM4495a2, 0);
                    }
                    C0558d0 c0558d0 = new C0558d0((byte) 17);
                    c0558d0.f16655b = c0489bfM4495a;
                    c0558d0.f16656c = ga4Var2;
                    VarHandle.storeStoreFence();
                    return z50Var.m13338a(c0558d0);
                }
                ga4 ga4Var3 = f10Var.f18645s;
                g63 g63Var = (g63) lb5VarMo5797a;
                C0489bf c0489bf2 = g63Var.f19622o;
                if (z2) {
                    C0558d0 c0558d1 = new C0558d0((byte) 18);
                    c0558d1.f16655b = g63Var;
                    c0558d1.f16656c = ga4Var3;
                    VarHandle.storeStoreFence();
                    return z50Var.m13338a(c0558d1);
                }
                if (ga4Var3 != null) {
                    long jM9464c = pb0.m9464c(ga4Var3.f19691a, 1.0f, 0.0f, 0.0f, 0.0f, 14);
                    BlendModeColorFilter blendModeColorFilter = new BlendModeColorFilter(zy5.m13858V(jM9464c), d24.m4295J(5));
                    o00Var = new o00();
                    o00Var.f26229a = blendModeColorFilter;
                    o00Var.f26230b = jM9464c;
                    o00Var.f26231c = 5;
                    VarHandle.storeStoreFence();
                    i = 1;
                } else {
                    o00Var = null;
                    i = 0;
                }
                jl3 jl3VarM3561d = c0489bf2.m3561d();
                float f5 = jl3VarM3561d.f22397b;
                float f6 = jl3VarM3561d.f22396a;
                b10 b10Var2 = f10Var.f18643q;
                if (b10Var2 == null) {
                    b10Var2 = new b10();
                    f10Var.f18643q = b10Var2;
                }
                C0489bf c0489bfM4495a3 = b10Var2.f14992d;
                if (c0489bfM4495a3 == null) {
                    c0489bfM4495a3 = AbstractC0573df.m4495a();
                    b10Var2.f14992d = c0489bfM4495a3;
                }
                c0489bfM4495a3.m3564g();
                o83[] o83VarArr = o83.f26438a;
                float f7 = jl3VarM3561d.f22396a;
                float f8 = jl3VarM3561d.f22399d;
                boolean z3 = true;
                float f9 = jl3VarM3561d.f22398c;
                float f10 = jl3VarM3561d.f22397b;
                if (Float.isNaN(f7) || Float.isNaN(f10) || Float.isNaN(f9) || Float.isNaN(f8)) {
                    AbstractC0573df.m4496b("Invalid rectangle, make sure no value is NaN");
                }
                RectF rectF = c0489bfM4495a3.f15229b;
                if (rectF == null) {
                    rectF = new RectF();
                    c0489bfM4495a3.f15229b = rectF;
                }
                rectF.set(f7, f10, f9, f8);
                c0489bfM4495a3.f15228a.addRect(c0489bfM4495a3.f15229b, Path.Direction.CCW);
                c0489bfM4495a3.m3563f(c0489bfM4495a3, c0489bf2, 0);
                ql3 ql3Var = new ql3();
                long jCeil = (((long) ((int) Math.ceil(jl3VarM3561d.f22399d - f5))) & 4294967295L) | (((long) ((int) Math.ceil(jl3VarM3561d.f22398c - f6))) << 32);
                b10 b10Var3 = f10Var.f18643q;
                C0759ie c0759ie = b10Var3.f14989a;
                C1325xb c1325xb2 = b10Var3.f14990b;
                if (c0759ie != null) {
                    int iM6770a = c0759ie.m6770a();
                    u02Var = new u02();
                    u02Var.f31577a = iM6770a;
                    VarHandle.storeStoreFence();
                } else {
                    u02Var = null;
                }
                if (u02Var == null || u02Var.f31577a != 0) {
                    if (c0759ie != null) {
                        int iM6770a2 = c0759ie.m6770a();
                        u02Var2 = new u02();
                        u02Var2.f31577a = iM6770a2;
                        VarHandle.storeStoreFence();
                    } else {
                        u02Var2 = null;
                    }
                    if (u02Var2 == null || i != u02Var2.f31577a) {
                        z3 = false;
                    }
                }
                try {
                    try {
                        if (c0759ie != null && c1325xb2 != null) {
                            c0489bf = c0489bfM4495a3;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (z50Var.f35750a.mo8940d() >> 32));
                            Bitmap bitmap = c0759ie.f21276a;
                            if (fIntBitsToFloat <= bitmap.getWidth() && Float.intBitsToFloat((int) (z50Var.f35750a.mo8940d() & 4294967295L)) <= bitmap.getHeight() && z3) {
                                c1325xb = c1325xb2;
                                c0759ieM13873h = c0759ie;
                            }
                            j70Var = b10Var3.f14991c;
                            if (j70Var == null) {
                                j70Var = new j70();
                                b10Var3.f14991c = j70Var;
                            }
                            jp0Var = j70Var.f22064b;
                            i70 i70Var = j70Var.f22063a;
                            long jM13369a0 = z62.m13369a0(jCeil);
                            j70 j70Var2 = j70Var;
                            df2 layoutDirection = z50Var.f35750a.getLayoutDirection();
                            o00 o00Var2 = o00Var;
                            ky0 ky0Var = i70Var.f21146a;
                            df2 df2Var = i70Var.f21147b;
                            h70 h70Var = i70Var.f21148c;
                            C0759ie c0759ie2 = c0759ieM13873h;
                            long j2 = i70Var.f21149d;
                            i70Var.f21146a = z50Var;
                            i70Var.f21147b = layoutDirection;
                            i70Var.f21148c = c1325xb;
                            i70Var.f21149d = jM13369a0;
                            c1325xb.mo6253j();
                            u31.m11225x(j70Var2, pb0.f27495b, 0L, jM13369a0, null, 58);
                            f = -f6;
                            f2 = -f5;
                            ((ar3) jp0Var.f22481b).m3130A(f, f2);
                            u31.m11217A(j70Var2, g63Var.f19622o, ga4Var3, 0.0f, new pd4(f4, 0.0f, 0, 0, 30), 52);
                            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (j70Var2.mo11227d() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (j70Var2.mo11227d() >> 32));
                            float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (j70Var2.mo11227d() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (j70Var2.mo11227d() & 4294967295L));
                            long jMo11226a0 = j70Var2.mo11226a0();
                            jM7219E = jp0Var.m7219E();
                            jp0Var.m7248w().mo6253j();
                            C1325xb c1325xb3 = c1325xb;
                            ((ar3) jp0Var.f22481b).m3155y(fIntBitsToFloat2, fIntBitsToFloat3, jMo11226a0);
                            u31.m11217A(j70Var2, c0489bf, ga4Var3, 0.0f, null, 28);
                            jp0Var.m7248w().mo6251g();
                            jp0Var.m7230T(jM7219E);
                            ((ar3) jp0Var.f22481b).m3130A(-f, -f2);
                            c1325xb3.mo6251g();
                            i70Var.f21146a = ky0Var;
                            i70Var.f21147b = df2Var;
                            i70Var.f21148c = h70Var;
                            i70Var.f21149d = j2;
                            c0759ie2.f21276a.prepareToDraw();
                            ql3Var.f28555a = c0759ie2;
                            e10 e10Var = new e10((byte) 0);
                            e10Var.f17580c = jl3VarM3561d;
                            e10Var.f17581d = ql3Var;
                            e10Var.f17579b = jCeil;
                            e10Var.f17582e = o00Var2;
                            VarHandle.storeStoreFence();
                            return z50Var.m13338a(e10Var);
                        }
                        c0489bf = c0489bfM4495a3;
                        ((ar3) jp0Var.f22481b).m3155y(fIntBitsToFloat2, fIntBitsToFloat3, jMo11226a0);
                        u31.m11217A(j70Var2, c0489bf, ga4Var3, 0.0f, null, 28);
                        jp0Var.m7248w().mo6251g();
                        jp0Var.m7230T(jM7219E);
                        ((ar3) jp0Var.f22481b).m3130A(-f, -f2);
                        c1325xb3.mo6251g();
                        i70Var.f21146a = ky0Var;
                        i70Var.f21147b = df2Var;
                        i70Var.f21148c = h70Var;
                        i70Var.f21149d = j2;
                        c0759ie2.f21276a.prepareToDraw();
                        ql3Var.f28555a = c0759ie2;
                        e10 e10Var2 = new e10((byte) 0);
                        e10Var2.f17580c = jl3VarM3561d;
                        e10Var2.f17581d = ql3Var;
                        e10Var2.f17579b = jCeil;
                        e10Var2.f17582e = o00Var2;
                        VarHandle.storeStoreFence();
                        return z50Var.m13338a(e10Var2);
                    } catch (Throwable th) {
                        jp0Var.m7248w().mo6251g();
                        jp0Var.m7230T(jM7219E);
                        throw th;
                    }
                    u31.m11217A(j70Var2, g63Var.f19622o, ga4Var3, 0.0f, new pd4(f4, 0.0f, 0, 0, 30), 52);
                    float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (j70Var2.mo11227d() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (j70Var2.mo11227d() >> 32));
                    float fIntBitsToFloat5 = (Float.intBitsToFloat((int) (j70Var2.mo11227d() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (j70Var2.mo11227d() & 4294967295L));
                    long jMo11226a1 = j70Var2.mo11226a0();
                    jM7219E = jp0Var.m7219E();
                    jp0Var.m7248w().mo6253j();
                    C1325xb c1325xb4 = c1325xb;
                } catch (Throwable th2) {
                    ((ar3) jp0Var.f22481b).m3130A(-f, -f2);
                    throw th2;
                }
                c0759ieM13873h = zy5.m13873h((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
                b10Var3.f14989a = c0759ieM13873h;
                Canvas canvas = AbstractC1362yb.f35080a;
                c1325xb = new C1325xb();
                c1325xb.f34122a = new Canvas(AbstractC0647fd.m5679r(c0759ieM13873h));
                b10Var3.f14990b = c1325xb;
                j70Var = b10Var3.f14991c;
                if (j70Var == null) {
                    j70Var = new j70();
                    b10Var3.f14991c = j70Var;
                }
                jp0Var = j70Var.f22064b;
                i70 i70Var2 = j70Var.f22063a;
                long jM13369a1 = z62.m13369a0(jCeil);
                j70 j70Var3 = j70Var;
                df2 layoutDirection2 = z50Var.f35750a.getLayoutDirection();
                o00 o00Var3 = o00Var;
                ky0 ky0Var2 = i70Var2.f21146a;
                df2 df2Var2 = i70Var2.f21147b;
                h70 h70Var2 = i70Var2.f21148c;
                C0759ie c0759ie3 = c0759ieM13873h;
                long j3 = i70Var2.f21149d;
                i70Var2.f21146a = z50Var;
                i70Var2.f21147b = layoutDirection2;
                i70Var2.f21148c = c1325xb;
                i70Var2.f21149d = jM13369a1;
                c1325xb.mo6253j();
                u31.m11225x(j70Var3, pb0.f27495b, 0L, jM13369a1, null, 58);
                f = -f6;
                f2 = -f5;
                ((ar3) jp0Var.f22481b).m3130A(f, f2);
                break;
            case 20:
                a30 a30Var = (a30) this.f29778b;
                jl3 jl3Var = (jl3) obj;
                if (a30Var.f25208n) {
                    lb5.m7910S(a30Var.m8391C0(), null, null, new C0594e0((Object) a30Var, (Object) jl3Var, wm0Var, (byte) 11), 3);
                }
                return ju4Var;
            case 21:
                yf2 yf2Var = (yf2) obj;
                ((eh0) this.f29778b).invoke(yf2Var);
                yf2Var.m13113a();
                return ju4Var;
            case 22:
                od1 od1Var = (od1) this.f29778b;
                kz3 kz3Var = (kz3) obj;
                if (od1Var.f26639d.mo9868a()) {
                    ce0 ce0Var = new ce0(b4);
                    ce0Var.f15969b = od1Var;
                    VarHandle.storeStoreFence();
                    kz3Var.m7753a("trial_mode_header", new pg0(1950619687, true, ce0Var));
                }
                kz3Var.m7753a("go_premium_header", y62.f34927e);
                kz3Var.m7753a("go_premium_footer", y62.f34931i);
                return ju4Var;
            case 23:
                lv1 lv1Var = (lv1) this.f29778b;
                if (lv1Var != null) {
                    lv1Var.m8115a(new dv1(d55.m4371p(0.7f, 1, 0), nv1.m8856a()));
                }
                return ju4Var;
            case 24:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f29778b;
                if (((Throwable) obj) != null) {
                    cancellationSignal.cancel();
                }
                return ju4Var;
            case 25:
                ii0 ii0Var = (ii0) this.f29778b;
                C1144sg c1144sg = ii0Var.f21457x;
                if (c1144sg != null) {
                    return c1144sg;
                }
                View view = ii0Var.f21434a;
                C1144sg c1144sg2 = new C1144sg();
                c1144sg2.f30238a = view;
                VarHandle.storeStoreFence();
                ii0Var.f21457x = c1144sg2;
                return c1144sg2;
            case 26:
                ru0 ru0Var = (ru0) this.f29778b;
                dg4 dg4Var = ru0Var.f29634j;
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    su0 su0Var = ru0Var.f29632h;
                    yf1 yf1Var = new yf1(Integer.MAX_VALUE);
                    yf1Var.f35193b = th3;
                    VarHandle.storeStoreFence();
                    su0Var.m10918c(yf1Var);
                }
                if (dg4Var.m4507a()) {
                    ((ff1) dg4Var.getValue()).close();
                }
                return ju4Var;
            case 27:
                ((d01) this.f29778b).f16674k = true;
                return ju4Var;
            case 28:
                js1 js1Var = (js1) this.f29778b;
                x11 x11Var = (x11) obj;
                if (!x11Var.f25195a.f25208n) {
                    return op4.f26939b;
                }
                x11 x11Var2 = x11Var.f33909q;
                if (x11Var2 != null) {
                    C1127s c1127s = new C1127s((byte) 28);
                    c1127s.f29778b = js1Var;
                    VarHandle.storeStoreFence();
                    if (c1127s.invoke(x11Var2) == op4.f26938a) {
                        dt0.m4698a0(x11Var2, c1127s);
                    }
                }
                x11Var.f33909q = null;
                x11Var.f33908p = null;
                return op4.f26938a;
            default:
                as1 as1Var = (as1) obj;
                return Boolean.valueOf(as1Var instanceof c31 ? ((Boolean) ((m10) this.f29778b).invoke(as1Var)).booleanValue() : true);
        }
    }
}
