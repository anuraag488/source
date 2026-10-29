package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class r81 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ Object f29075A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ Object f29076B;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f29077t = 1;

    /* JADX INFO: renamed from: u */
    public boolean f29078u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ v81 f29079v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ b12 f29080w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f29081x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ za1 f29082y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f29083z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r81(v81 v81Var, b12 b12Var, Object obj, b63 b63Var, za1 za1Var, gs2 gs2Var, ok3 ok3Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f29079v = v81Var;
        this.f29080w = b12Var;
        this.f29081x = obj;
        this.f29083z = b63Var;
        this.f29082y = za1Var;
        this.f29075A = gs2Var;
        this.f29076B = ok3Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f29077t;
        Object obj2 = this.f29076B;
        Object obj3 = this.f29075A;
        Object obj4 = this.f29083z;
        switch (b) {
            case 0:
                za1 za1Var = this.f29082y;
                return new r81(this.f29079v, (ql3) obj4, (ql3) obj3, this.f29080w, this.f29081x, (ql3) obj2, za1Var, wm0Var);
            default:
                return new r81(this.f29079v, this.f29080w, this.f29081x, (b63) obj4, this.f29082y, (gs2) obj3, (ok3) obj2, wm0Var);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29077t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((r81) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws Throwable {
        r81 r81Var;
        pk3 pk3Var;
        Bitmap bitmap;
        boolean z;
        switch (this.f29077t) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z2 = this.f29078u;
                if (z2) {
                    if (z2) {
                        k43.m7376J(obj);
                        return obj;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                v81 v81Var = this.f29079v;
                oa4 oa4Var = (oa4) ((ql3) this.f29083z).f28555a;
                ig0 ig0Var = (ig0) ((ql3) this.f29075A).f28555a;
                b12 b12Var = this.f29080w;
                Object obj2 = this.f29081x;
                b63 b63Var = (b63) ((ql3) this.f29076B).f28555a;
                za1 za1Var = this.f29082y;
                this.f29078u = true;
                Object objM11763a = v81Var.m11763a(oa4Var, ig0Var, b12Var, obj2, b63Var, za1Var, this);
                return objM11763a == ap0Var ? ap0Var : objM11763a;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z3 = this.f29078u;
                if (!z3) {
                    k43.m7376J(obj);
                    v81 v81Var2 = this.f29079v;
                    b12 b12Var2 = this.f29080w;
                    Object obj3 = this.f29081x;
                    b63 b63Var2 = (b63) this.f29083z;
                    za1 za1Var2 = this.f29082y;
                    this.f29078u = true;
                    r81Var = this;
                    obj = v81Var2.m11764b(b12Var2, obj3, b63Var2, za1Var2, r81Var);
                    if (obj == ap0Var2) {
                        return ap0Var2;
                    }
                } else {
                    if (!z3) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                    r81Var = this;
                }
                o81 o81Var = (o81) obj;
                fg4 fg4Var = r81Var.f29079v.f32458b;
                synchronized (fg4Var) {
                    try {
                        lk3 lk3Var = (lk3) fg4Var.f18964a.get();
                        if (lk3Var == null) {
                            fg4Var.m5707b();
                        } else if (fg4Var.f18965b == null) {
                            Context context = lk3Var.f24103a;
                            fg4Var.f18965b = context;
                            context.registerComponentCallbacks(fg4Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                js1 js1Var = r81Var.f29079v.f32460d;
                gs2 gs2Var = (gs2) r81Var.f29075A;
                b12 b12Var3 = r81Var.f29080w;
                js1Var.getClass();
                if (!b12Var3.f15009n.f128b || (pk3Var = (pk3) ((lk3) js1Var.f22555a).f24105c.getValue()) == null || gs2Var == null) {
                    z = false;
                } else {
                    Drawable drawable = o81Var.f26422a;
                    BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
                    if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
                        z = false;
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("coil#is_sampled", Boolean.valueOf(o81Var.f26423b));
                        String str = o81Var.f26425d;
                        if (str != null) {
                            linkedHashMap.put("coil#disk_cache_key", str);
                        }
                        pk3Var.f27690a.mo7270a(new gs2(gs2Var.f20091a, AbstractC1356y5.m12902K(gs2Var.f20092b)), bitmap, AbstractC1356y5.m12902K(linkedHashMap));
                        z = true;
                    }
                }
                Drawable drawable2 = o81Var.f26422a;
                b12 b12Var4 = r81Var.f29080w;
                r81 r81Var2 = r81Var;
                kt0 kt0Var = o81Var.f26424c;
                gs2 gs2Var2 = z ? (gs2) r81Var2.f29075A : null;
                String str2 = o81Var.f26425d;
                boolean z4 = o81Var.f26423b;
                ok3 ok3Var = (ok3) r81Var2.f29076B;
                Bitmap.Config[] configArr = AbstractC0707h.f20231a;
                return new me4(drawable2, b12Var4, kt0Var, gs2Var2, str2, z4, ok3Var != null && ok3Var.f26818g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r81(v81 v81Var, ql3 ql3Var, ql3 ql3Var2, b12 b12Var, Object obj, ql3 ql3Var3, za1 za1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f29079v = v81Var;
        this.f29083z = ql3Var;
        this.f29075A = ql3Var2;
        this.f29080w = b12Var;
        this.f29081x = obj;
        this.f29076B = ql3Var3;
        this.f29082y = za1Var;
    }
}
