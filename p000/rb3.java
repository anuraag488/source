package p000;

import ads_mobile_sdk.C0200km;
import ads_mobile_sdk.rc2;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.view.textclassifier.TextClassifier;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rb3 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f29131t = 2;

    /* JADX INFO: renamed from: u */
    public boolean f29132u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f29133v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ long f29134w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f29135x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f29136y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb3(rc2 rc2Var, long j, Network network, NetworkCapabilities networkCapabilities, wm0 wm0Var) {
        super(2, wm0Var);
        this.f29133v = rc2Var;
        this.f29134w = j;
        this.f29135x = network;
        this.f29136y = networkCapabilities;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f29131t;
        Object obj2 = this.f29136y;
        Object obj3 = this.f29135x;
        switch (b) {
            case 0:
                rb3 rb3Var = new rb3(this.f29134w, wm0Var, (tb3) obj3, (CharSequence) obj2);
                rb3Var.f29133v = obj;
                return rb3Var;
            case 1:
                rb3 rb3Var2 = new rb3((vy3) obj3, this.f29134w, (nl3) obj2, wm0Var);
                rb3Var2.f29133v = obj;
                return rb3Var2;
            case 2:
                return new rb3(this.f29134w, (i82) this.f29133v, (String) obj3, (C0200km) obj2, wm0Var);
            case 3:
                rb3 rb3Var3 = new rb3(this.f29134w, (i82) obj3, (String) obj2, wm0Var);
                rb3Var3.f29133v = obj;
                return rb3Var3;
            default:
                return new rb3((rc2) this.f29133v, this.f29134w, (Network) obj3, (NetworkCapabilities) obj2, wm0Var);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29131t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((rb3) create((wm0) obj2, (TextClassifier) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((rb3) create((wm0) obj2, (ty3) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((rb3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 3:
                return ((rb3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                return ((rb3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006b -> B:66:0x006f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rb3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb3(vy3 vy3Var, long j, nl3 nl3Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f29135x = vy3Var;
        this.f29134w = j;
        this.f29136y = nl3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb3(long j, i82 i82Var, String str, wm0 wm0Var) {
        super(2, wm0Var);
        this.f29134w = j;
        this.f29135x = i82Var;
        this.f29136y = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb3(long j, i82 i82Var, String str, C0200km c0200km, wm0 wm0Var) {
        super(2, wm0Var);
        this.f29134w = j;
        this.f29133v = i82Var;
        this.f29135x = str;
        this.f29136y = c0200km;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb3(long j, wm0 wm0Var, tb3 tb3Var, CharSequence charSequence) {
        super(2, wm0Var);
        this.f29135x = tb3Var;
        this.f29136y = charSequence;
        this.f29134w = j;
    }
}
