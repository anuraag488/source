package p000;

/* JADX INFO: renamed from: yi */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1369yi extends ue2 implements yp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f35232i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1406zi f35233j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1369yi(C1406zi c1406zi, byte b) {
        super(1);
        this.f35232i = b;
        this.f35233j = c1406zi;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f35232i;
        ju4 ju4Var = ju4.f22634a;
        int i = 0;
        C1406zi c1406zi = this.f35233j;
        switch (b) {
            case 0:
                cb3 cb3Var = (cb3) obj;
                db3[] db3VarArr = c1406zi.f36104c;
                int i2 = c1406zi.f36106e;
                int i3 = c1406zi.f36108g;
                int length = db3VarArr.length;
                while (i < length) {
                    db3 db3Var = db3VarArr[i];
                    if (db3Var != null) {
                        long jMo3927a = c1406zi.f36102a.f20616b.mo3927a((((long) db3Var.f16899a) << 32) | (((long) db3Var.f16900b) & 4294967295L), (((long) i2) << 32) | (((long) i3) & 4294967295L), df2.f17011a);
                        cb3Var.m3952k(db3Var, (int) (jMo3927a >> 32), (int) (jMo3927a & 4294967295L), 0.0f);
                    }
                    i++;
                    db3VarArr = db3VarArr;
                }
                break;
            default:
                cb3 cb3Var2 = (cb3) obj;
                db3[] db3VarArr2 = c1406zi.f36103b;
                int i4 = c1406zi.f36105d;
                int i5 = c1406zi.f36107f;
                int length2 = db3VarArr2.length;
                while (i < length2) {
                    db3 db3Var2 = db3VarArr2[i];
                    if (db3Var2 != null) {
                        InterfaceC0520ca interfaceC0520ca = c1406zi.f36102a.f20616b;
                        int i6 = db3Var2.f16899a;
                        long jMo3927a2 = interfaceC0520ca.mo3927a((((long) db3Var2.f16900b) & 4294967295L) | (((long) i6) << 32), (((long) i4) << 32) | (((long) i5) & 4294967295L), df2.f17011a);
                        cb3Var2.m3952k(db3Var2, (int) (jMo3927a2 >> 32), (int) (jMo3927a2 & 4294967295L), 0.0f);
                    }
                    i++;
                    ju4Var = ju4Var;
                }
                break;
        }
        return ju4Var;
    }
}
