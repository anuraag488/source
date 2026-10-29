package p000;

import android.content.ContentResolver;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: xg */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1330xg extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ gx2 f34254A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ Method f34255B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ ContentResolver f34256C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ String f34257D;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f34258E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ mq1 f34259F;

    /* JADX INFO: renamed from: t */
    public gx2 f34260t;

    /* JADX INFO: renamed from: u */
    public Method f34261u;

    /* JADX INFO: renamed from: v */
    public ContentResolver f34262v;

    /* JADX INFO: renamed from: w */
    public String f34263w;

    /* JADX INFO: renamed from: x */
    public Object f34264x;

    /* JADX INFO: renamed from: y */
    public mq1 f34265y;

    /* JADX INFO: renamed from: z */
    public boolean f34266z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1330xg(gx2 gx2Var, Method method, ContentResolver contentResolver, String str, Object obj, mq1 mq1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f34254A = gx2Var;
        this.f34255B = method;
        this.f34256C = contentResolver;
        this.f34257D = str;
        this.f34258E = obj;
        this.f34259F = mq1Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        return new C1330xg(this.f34254A, this.f34255B, this.f34256C, this.f34257D, this.f34258E, this.f34259F, wm0Var);
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((C1330xg) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        Method method;
        ContentResolver contentResolver;
        gx2 gx2Var;
        String str;
        Object obj2;
        mq1 mq1Var;
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f34266z;
        if (!z) {
            k43.m7376J(obj);
            gx2 gx2Var2 = this.f34254A;
            this.f34260t = gx2Var2;
            method = this.f34255B;
            this.f34261u = method;
            contentResolver = this.f34256C;
            this.f34262v = contentResolver;
            String str2 = this.f34257D;
            this.f34263w = str2;
            Object obj3 = this.f34258E;
            this.f34264x = obj3;
            mq1 mq1Var2 = this.f34259F;
            this.f34265y = mq1Var2;
            this.f34266z = true;
            if (gx2Var2.m6191e(this) == ap0Var) {
                return ap0Var;
            }
            gx2Var = gx2Var2;
            str = str2;
            obj2 = obj3;
            mq1Var = mq1Var2;
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mq1Var = this.f34265y;
            obj2 = this.f34264x;
            str = this.f34263w;
            contentResolver = this.f34262v;
            method = this.f34261u;
            gx2Var = this.f34260t;
            k43.m7376J(obj);
        }
        try {
            method.invoke(null, contentResolver, str, obj2);
        } catch (Throwable th) {
            try {
                mq1Var.invoke(obj2, th);
            } finally {
                gx2Var.m6193g(null);
            }
        }
        return ju4.f22634a;
    }
}
