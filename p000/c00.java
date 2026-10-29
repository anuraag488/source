package p000;

import ads_mobile_sdk.C0132ga;
import ads_mobile_sdk.C0200km;
import ads_mobile_sdk.a83;
import ads_mobile_sdk.dp2;
import ads_mobile_sdk.ff3;
import ads_mobile_sdk.pn2;
import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class c00 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ Object f15722A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ Object f15723B;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f15724t;

    /* JADX INFO: renamed from: u */
    public int f15725u;

    /* JADX INFO: renamed from: v */
    public byte f15726v;

    /* JADX INFO: renamed from: w */
    public Object f15727w;

    /* JADX INFO: renamed from: x */
    public Object f15728x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f15729y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f15730z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c00(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f15724t = b;
        this.f15728x = obj;
        this.f15729y = obj2;
        this.f15730z = obj3;
        this.f15722A = obj4;
        this.f15723B = obj5;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f15724t;
        Object obj2 = this.f15723B;
        Object obj3 = this.f15722A;
        Object obj4 = this.f15730z;
        Object obj5 = this.f15729y;
        switch (b) {
            case 0:
                c00 c00Var = new c00((C1349xz) this.f15728x, (Activity) obj5, (og3) obj4, (sg3) obj3, (xn2) obj2, wm0Var, (byte) 0);
                c00Var.f15727w = obj;
                return c00Var;
            case 1:
                c00 c00Var2 = new c00((ff3) this.f15728x, (i82) obj5, (C0200km) obj4, (C0200km) obj3, (C0132ga) obj2, wm0Var, (byte) 1);
                c00Var2.f15727w = obj;
                return c00Var2;
            default:
                return new c00((pn2) obj5, (a83) obj4, (dp2) obj3, (C0007a6) obj2, this.f15725u, wm0Var);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f15724t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((c00) create((wm0) obj2, (C0927mz) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((c00) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                return ((c00) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x020e A[Catch: CancellationException -> 0x027c, all -> 0x038a, TRY_ENTER, TryCatch #6 {CancellationException -> 0x027c, blocks: (B:129:0x020e, B:131:0x0214, B:134:0x0221, B:137:0x0228, B:140:0x025c, B:146:0x0277, B:148:0x027f, B:150:0x0288, B:169:0x02ed, B:144:0x026f, B:124:0x01f9), top: B:319:0x01f9 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0220 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:134:0x0221 A[Catch: CancellationException -> 0x027c, all -> 0x038a, TryCatch #6 {CancellationException -> 0x027c, blocks: (B:129:0x020e, B:131:0x0214, B:134:0x0221, B:137:0x0228, B:140:0x025c, B:146:0x0277, B:148:0x027f, B:150:0x0288, B:169:0x02ed, B:144:0x026f, B:124:0x01f9), top: B:319:0x01f9 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0259  */
    /* JADX WARN: Code duplicated, block: B:146:0x0277 A[Catch: CancellationException -> 0x027c, all -> 0x038a, TryCatch #6 {CancellationException -> 0x027c, blocks: (B:129:0x020e, B:131:0x0214, B:134:0x0221, B:137:0x0228, B:140:0x025c, B:146:0x0277, B:148:0x027f, B:150:0x0288, B:169:0x02ed, B:144:0x026f, B:124:0x01f9), top: B:319:0x01f9 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x027f A[Catch: CancellationException -> 0x027c, all -> 0x038a, TryCatch #6 {CancellationException -> 0x027c, blocks: (B:129:0x020e, B:131:0x0214, B:134:0x0221, B:137:0x0228, B:140:0x025c, B:146:0x0277, B:148:0x027f, B:150:0x0288, B:169:0x02ed, B:144:0x026f, B:124:0x01f9), top: B:319:0x01f9 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0288 A[Catch: CancellationException -> 0x027c, all -> 0x038a, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x027c, blocks: (B:129:0x020e, B:131:0x0214, B:134:0x0221, B:137:0x0228, B:140:0x025c, B:146:0x0277, B:148:0x027f, B:150:0x0288, B:169:0x02ed, B:144:0x026f, B:124:0x01f9), top: B:319:0x01f9 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x02a6 A[Catch: CancellationException -> 0x0311, all -> 0x0314, TryCatch #15 {CancellationException -> 0x0311, blocks: (B:151:0x0294, B:153:0x02a6, B:162:0x02ca, B:165:0x02d3, B:167:0x02dc), top: B:332:0x0294 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:159:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:162:0x02ca A[Catch: CancellationException -> 0x0311, all -> 0x0314, TryCatch #15 {CancellationException -> 0x0311, blocks: (B:151:0x0294, B:153:0x02a6, B:162:0x02ca, B:165:0x02d3, B:167:0x02dc), top: B:332:0x0294 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x031b A[Catch: all -> 0x0301, CancellationException -> 0x03fa, TryCatch #20 {CancellationException -> 0x03fa, all -> 0x0301, blocks: (B:196:0x0367, B:171:0x02f2, B:183:0x031b, B:186:0x032d, B:187:0x0331, B:190:0x0343, B:191:0x0349, B:194:0x035b), top: B:339:0x0367 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x032c  */
    /* JADX WARN: Code duplicated, block: B:186:0x032d A[Catch: all -> 0x0301, CancellationException -> 0x03fa, TryCatch #20 {CancellationException -> 0x03fa, all -> 0x0301, blocks: (B:196:0x0367, B:171:0x02f2, B:183:0x031b, B:186:0x032d, B:187:0x0331, B:190:0x0343, B:191:0x0349, B:194:0x035b), top: B:339:0x0367 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x0331 A[Catch: all -> 0x0301, CancellationException -> 0x03fa, TryCatch #20 {CancellationException -> 0x03fa, all -> 0x0301, blocks: (B:196:0x0367, B:171:0x02f2, B:183:0x031b, B:186:0x032d, B:187:0x0331, B:190:0x0343, B:191:0x0349, B:194:0x035b), top: B:339:0x0367 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x0342  */
    /* JADX WARN: Code duplicated, block: B:190:0x0343 A[Catch: all -> 0x0301, CancellationException -> 0x03fa, TryCatch #20 {CancellationException -> 0x03fa, all -> 0x0301, blocks: (B:196:0x0367, B:171:0x02f2, B:183:0x031b, B:186:0x032d, B:187:0x0331, B:190:0x0343, B:191:0x0349, B:194:0x035b), top: B:339:0x0367 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x0349 A[Catch: all -> 0x0301, CancellationException -> 0x03fa, TryCatch #20 {CancellationException -> 0x03fa, all -> 0x0301, blocks: (B:196:0x0367, B:171:0x02f2, B:183:0x031b, B:186:0x032d, B:187:0x0331, B:190:0x0343, B:191:0x0349, B:194:0x035b), top: B:339:0x0367 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x035a  */
    /* JADX WARN: Code duplicated, block: B:194:0x035b A[Catch: all -> 0x0301, CancellationException -> 0x03fa, TryCatch #20 {CancellationException -> 0x03fa, all -> 0x0301, blocks: (B:196:0x0367, B:171:0x02f2, B:183:0x031b, B:186:0x032d, B:187:0x0331, B:190:0x0343, B:191:0x0349, B:194:0x035b), top: B:339:0x0367 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x0363  */
    /* JADX WARN: Code duplicated, block: B:259:0x0490  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:198:0x0384 -> B:127:0x0208). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:230:0x03ed -> B:232:0x03f1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.c00.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c00(pn2 pn2Var, a83 a83Var, dp2 dp2Var, C0007a6 c0007a6, int i, wm0 wm0Var) {
        super(2, wm0Var);
        this.f15724t = (byte) 2;
        this.f15729y = pn2Var;
        this.f15730z = a83Var;
        this.f15722A = dp2Var;
        this.f15723B = c0007a6;
        this.f15725u = i;
    }
}
