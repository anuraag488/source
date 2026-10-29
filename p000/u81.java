package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class u81 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ o81 f31717A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ b63 f31718B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ List f31719C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ za1 f31720D;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ b12 f31721E;

    /* JADX INFO: renamed from: t */
    public List f31722t;

    /* JADX INFO: renamed from: u */
    public b63 f31723u;

    /* JADX INFO: renamed from: v */
    public int f31724v;

    /* JADX INFO: renamed from: w */
    public int f31725w;

    /* JADX INFO: renamed from: x */
    public boolean f31726x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f31727y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ v81 f31728z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u81(v81 v81Var, o81 o81Var, b63 b63Var, List list, za1 za1Var, b12 b12Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f31728z = v81Var;
        this.f31717A = o81Var;
        this.f31718B = b63Var;
        this.f31719C = list;
        this.f31720D = za1Var;
        this.f31721E = b12Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        u81 u81Var = new u81(this.f31728z, this.f31717A, this.f31718B, this.f31719C, this.f31720D, this.f31721E, wm0Var);
        u81Var.f31727y = obj;
        return u81Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((u81) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0059  */
    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        zo0 zo0Var;
        b63 b63Var;
        Bitmap bitmapM10823s;
        List list;
        int size;
        int i;
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f31726x;
        za1 za1Var = this.f31720D;
        o81 o81Var = this.f31717A;
        if (!z) {
            k43.m7376J(obj);
            zo0Var = (zo0) this.f31727y;
            Drawable drawable = o81Var.f26422a;
            boolean z2 = drawable instanceof BitmapDrawable;
            b63Var = this.f31718B;
            if (z2) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                Bitmap.Config config = bitmap.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (AbstractC0990oo.m9195P(config, AbstractC0707h.f20231a)) {
                    bitmapM10823s = bitmap;
                } else {
                    bitmapM10823s = sj3.m10823s(drawable, b63Var.f15110b, b63Var.f15112d, b63Var.f15113e, b63Var.f15114f);
                }
            } else {
                bitmapM10823s = sj3.m10823s(drawable, b63Var.f15110b, b63Var.f15112d, b63Var.f15113e, b63Var.f15114f);
            }
            za1Var.getClass();
            list = this.f31719C;
            size = list.size();
            i = 0;
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            size = this.f31725w;
            int i2 = this.f31724v;
            b63Var = this.f31723u;
            list = this.f31722t;
            zo0Var = (zo0) this.f31727y;
            k43.m7376J(obj);
            bitmapM10823s = (Bitmap) obj;
            y70.m13040t(zo0Var.mo6367f());
            i = i2 + 1;
        }
        if (i >= size) {
            za1Var.getClass();
            return new o81(new BitmapDrawable(this.f31721E.f14996a.getResources(), bitmapM10823s), o81Var.f26423b, o81Var.f26424c, o81Var.f26425d);
        }
        if (list.get(i) != null) {
            xy4.m12778e();
            return null;
        }
        g74 g74Var = b63Var.f15112d;
        this.f31727y = zo0Var;
        this.f31722t = list;
        this.f31723u = b63Var;
        this.f31724v = i;
        this.f31725w = size;
        this.f31726x = true;
        throw null;
    }
}
