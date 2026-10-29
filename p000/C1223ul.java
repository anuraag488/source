package p000;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/* JADX INFO: renamed from: ul */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1223ul implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31965a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C1112rl f31966b;

    public /* synthetic */ C1223ul(byte b) {
        this.f31965a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31965a;
        ju4 ju4Var = ju4.f22634a;
        C1112rl c1112rl = this.f31966b;
        switch (b) {
            case 0:
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                } else {
                    gl4.m6037b(c1112rl.f29387c, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var, 0, 0, 262142);
                }
                break;
            default:
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ir1Var2.m6874W();
                } else {
                    Object objM6869O = ir1Var2.m6869O();
                    if (objM6869O == ki0.f23136a) {
                        objM6869O = Instant.ofEpochMilli(i41.m6647f(c1112rl.f29386b)).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
                        ir1Var2.m6905n0(objM6869O);
                    }
                    gl4.m6037b((String) objM6869O, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var2, 0, 0, 262142);
                }
                break;
        }
        return ju4Var;
    }
}
