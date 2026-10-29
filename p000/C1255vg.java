package p000;

import android.content.ContentResolver;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: vg */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1255vg extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ String f32581A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ Integer f32582B;

    /* JADX INFO: renamed from: t */
    public C1367yg f32583t;

    /* JADX INFO: renamed from: u */
    public boolean f32584u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C1367yg f32585v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C0459am f32586w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Class f32587x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Method f32588y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ ContentResolver f32589z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1255vg(C1367yg c1367yg, C0459am c0459am, Class cls, Method method, ContentResolver contentResolver, String str, Integer num, wm0 wm0Var) {
        super(2, wm0Var);
        this.f32585v = c1367yg;
        this.f32586w = c0459am;
        this.f32587x = cls;
        this.f32588y = method;
        this.f32589z = contentResolver;
        this.f32581A = str;
        this.f32582B = num;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        return new C1255vg(this.f32585v, this.f32586w, this.f32587x, this.f32588y, this.f32589z, this.f32581A, this.f32582B, wm0Var);
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((C1255vg) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1367yg c1367yg;
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f32584u;
        if (!z) {
            k43.m7376J(obj);
            so0 so0Var = this.f32586w.f14621c;
            C1218ug c1218ug = new C1218ug(this.f32587x, this.f32588y, this.f32589z, this.f32581A, this.f32582B, (wm0) null);
            C1367yg c1367yg2 = this.f32585v;
            this.f32583t = c1367yg2;
            this.f32584u = true;
            obj = lb5.m7921b0(so0Var, c1218ug, this);
            if (obj == ap0Var) {
                return ap0Var;
            }
            c1367yg = c1367yg2;
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c1367yg = this.f32583t;
            k43.m7376J(obj);
        }
        c1367yg.f35202a.setValue(obj);
        return ju4.f22634a;
    }
}
