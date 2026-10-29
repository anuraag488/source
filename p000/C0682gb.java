package p000;

import ads_mobile_sdk.ff3;
import ads_mobile_sdk.h51;
import ads_mobile_sdk.jo1;
import ads_mobile_sdk.m64;
import ads_mobile_sdk.s41;
import ads_mobile_sdk.s63;
import ads_mobile_sdk.ux0;
import ads_mobile_sdk.xk1;
import ads_mobile_sdk.yg2;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;

/* JADX INFO: renamed from: gb */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0682gb extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f19696t;

    /* JADX INFO: renamed from: u */
    public byte f19697u;

    /* JADX INFO: renamed from: v */
    public Object f19698v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f19699w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0682gb(Object obj, Object obj2, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f19696t = b;
        this.f19698v = obj;
        this.f19699w = obj2;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f19696t;
        Object obj2 = this.f19699w;
        switch (b) {
            case 0:
                return new C0682gb((C0719hb) this.f19698v, (g21) obj2, wm0Var, (byte) 0);
            case 1:
                return new C0682gb((C1068qe) this.f19698v, (z32) obj2, wm0Var, (byte) 1);
            case 2:
                return new C0682gb((C0910mi) this.f19698v, (lu2) obj2, wm0Var, (byte) 2);
            case 3:
                return new C0682gb((t82) this.f19698v, (es0) obj2, wm0Var, (byte) 3);
            case 4:
                return new C0682gb((qw2) this.f19698v, (Intent) obj2, wm0Var, (byte) 4);
            case 5:
                C0682gb c0682gb = new C0682gb((ru2) obj2, wm0Var, (byte) 5);
                c0682gb.f19698v = obj;
                return c0682gb;
            case 6:
                return new C0682gb((yp1) this.f19698v, (sw2) obj2, wm0Var, (byte) 6);
            case 7:
                return new C0682gb((C1283w7) obj2, wm0Var, (byte) 7);
            case 8:
                return new C0682gb((t82) this.f19698v, (df3) obj2, wm0Var, (byte) 8);
            case 9:
                return new C0682gb((h51) this.f19698v, (WebResourceRequest) obj2, wm0Var, (byte) 9);
            case 10:
                return new C0682gb((jo1) this.f19698v, (yp1) obj2, wm0Var, (byte) 10);
            case 11:
                return new C0682gb((s41) obj2, wm0Var, (byte) 11);
            case 12:
                return new C0682gb((yg2) obj2, wm0Var, (byte) 12);
            case 13:
                C0682gb c0682gb2 = new C0682gb((s63) obj2, wm0Var, (byte) 13);
                c0682gb2.f19698v = obj;
                return c0682gb2;
            case 14:
                return new C0682gb((jo1) this.f19698v, (C0751i6) obj2, wm0Var, (byte) 14);
            case 15:
                return new C0682gb((m64) this.f19698v, (ff3) obj2, wm0Var, (byte) 15);
            case 16:
                return new C0682gb((ux0) this.f19698v, (wa2) obj2, wm0Var, (byte) 16);
            case 17:
                return new C0682gb((h51) this.f19698v, (Uri) obj2, wm0Var, (byte) 17);
            default:
                return new C0682gb((xk1) obj2, wm0Var, (byte) 18);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.f19696t;
        Object obj3 = this.f19699w;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((C0682gb) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((C0682gb) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((C0682gb) create((wm0) obj2, obj)).invokeSuspend(ju4Var);
            case 3:
                ((C0682gb) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
                return ap0.f14763a;
            case 4:
                return ((C0682gb) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 5:
                return ((C0682gb) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 6:
                return ((C0682gb) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 7:
                return ((C0682gb) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 8:
                return ((C0682gb) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 9:
                return new C0682gb((h51) this.f19698v, (WebResourceRequest) obj3, (wm0) obj2, (byte) 9).invokeSuspend(ju4Var);
            case 10:
                return new C0682gb((jo1) this.f19698v, (yp1) obj3, (wm0) obj2, (byte) 10).invokeSuspend(ju4Var);
            case 11:
                return new C0682gb((s41) obj3, (wm0) obj2, (byte) 11).invokeSuspend(ju4Var);
            case 12:
                return new C0682gb((yg2) obj3, (wm0) obj2, (byte) 12).invokeSuspend(ju4Var);
            case 13:
                C0682gb c0682gb = new C0682gb((s63) obj3, (wm0) obj2, (byte) 13);
                c0682gb.f19698v = (zo0) obj;
                return c0682gb.invokeSuspend(ju4Var);
            case 14:
                return new C0682gb((jo1) this.f19698v, (C0751i6) obj3, (wm0) obj2, (byte) 14).invokeSuspend(ju4Var);
            case 15:
                return new C0682gb((m64) this.f19698v, (ff3) obj3, (wm0) obj2, (byte) 15).invokeSuspend(ju4Var);
            case 16:
                return new C0682gb((ux0) this.f19698v, (wa2) obj3, (wm0) obj2, (byte) 16).invokeSuspend(ju4Var);
            case 17:
                return new C0682gb((h51) this.f19698v, (Uri) obj3, (wm0) obj2, (byte) 17).invokeSuspend(ju4Var);
            default:
                return new C0682gb((xk1) obj3, (wm0) obj2, (byte) 18).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:265:0x04d8 A[PHI: r2 r3 r4
  0x04d8: PHI (r2v25 zo0) = (r2v31 zo0), (r2v33 zo0) binds: [B:270:0x04f5, B:264:0x04d6] A[DONT_GENERATE, DONT_INLINE]
  0x04d8: PHI (r3v10 java.lang.Object) = (r3v15 java.lang.Object), (r3v16 java.lang.Object) binds: [B:270:0x04f5, B:264:0x04d6] A[DONT_GENERATE, DONT_INLINE]
  0x04d8: PHI (r4v1 gb) = (r4v4 gb), (r4v0 gb) binds: [B:270:0x04f5, B:264:0x04d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:269:0x04eb A[Catch: all -> 0x04c9, TryCatch #2 {all -> 0x04c9, blocks: (B:257:0x04c5, B:267:0x04e1, B:269:0x04eb, B:272:0x04f8, B:263:0x04d3), top: B:386:0x04bb }] */
    /* JADX WARN: Code duplicated, block: B:271:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:276:0x051b  */
    /* JADX WARN: Code duplicated, block: B:322:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:323:0x05c3 A[Catch: all -> 0x0581, TryCatch #0 {all -> 0x0581, blocks: (B:302:0x057d, B:327:0x05d2, B:320:0x05ba, B:323:0x05c3, B:307:0x0587, B:308:0x058b, B:309:0x0593, B:316:0x05aa, B:318:0x05b3), top: B:382:0x0573 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x01fe -> B:102:0x01bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:230:0x044a -> B:232:0x044e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:276:0x051b -> B:267:0x04e1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:324:0x05ce -> B:327:0x05d2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0682gb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0682gb(Object obj, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f19696t = b;
        this.f19699w = obj;
    }
}
