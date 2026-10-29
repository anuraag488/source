package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import java.io.EOFException;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class zt5 {

    /* JADX INFO: renamed from: a */
    public static final pg0 f36365a = new pg0(-984161972, false, new ah0(9));

    /* JADX INFO: renamed from: b */
    public static final float[] f36366b = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};

    /* JADX INFO: renamed from: c */
    public static final long[] f36367c = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};

    /* JADX INFO: renamed from: d */
    public static final Object f36368d = new Object();

    /* JADX INFO: renamed from: e */
    public static final Object f36369e = new Object();

    /* JADX INFO: renamed from: f */
    public static final z45 f36370f = new z45(12);

    /* JADX INFO: renamed from: g */
    public static final z45 f36371g = new z45(1);

    /* JADX INFO: renamed from: A */
    public static final C0875lk m13756A(xk4 xk4Var, int i) {
        C0875lk c0875lk = xk4Var.f34341a;
        long j = xk4Var.f34342b;
        int iM9903g = ql4.m9903g(j);
        int i2 = iM9903g - i;
        if (((iM9903g ^ i2) & (i ^ iM9903g)) < 0) {
            i2 = 0;
        }
        return c0875lk.subSequence(Math.max(0, i2), ql4.m9903g(j));
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m13757B(i14 i14Var) {
        e14 e14VarM6549k = i14Var.m6549k();
        return e14VarM6549k.f17631a.m8128c(m14.f24534A);
    }

    /* JADX INFO: renamed from: C */
    public static final boolean m13758C(mi0 mi0Var) {
        return ((Number) n40.m8515y("navigation_mode", EnumC1070qg.f28446a, -1, mi0Var).f35202a.getValue()).intValue() == 0;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX INFO: renamed from: D */
    public static final float m13759D(cb3 cb3Var, boolean z, gx1[] gx1VarArr, float f) {
        float f2 = Float.NaN;
        for (gx1 gx1Var : gx1VarArr) {
            float fMo3947a = cb3Var.mo3947a(gx1Var);
            if (Float.isNaN(f2)) {
                f2 = fMo3947a;
            } else if (z == (fMo3947a > f2)) {
                f2 = fMo3947a;
            }
        }
        return Float.isNaN(f2) ? f : f2;
    }

    /* JADX INFO: renamed from: E */
    public static final boolean m13760E(w94 w94Var, yp1 yp1Var) {
        int i;
        AbstractC0003a2 abstractC0003a2;
        Object objInvoke;
        e94 e94VarM7451h;
        boolean zM13780k;
        do {
            synchronized (f36369e) {
                dc4 dc4Var = (dc4) k94.m7449f(w94Var.f33182a);
                i = dc4Var.f16982d;
                abstractC0003a2 = dc4Var.f16981c;
            }
            ua3 ua3VarMo20e = abstractC0003a2.mo20e();
            objInvoke = yp1Var.invoke(ua3VarMo20e);
            AbstractC0003a2 abstractC0003a2M11354c = ua3VarMo20e.m11354c();
            if (z62.m13387o(abstractC0003a2M11354c, abstractC0003a2)) {
                break;
            }
            dc4 dc4Var2 = w94Var.f33182a;
            synchronized (k94.f23012c) {
                e94VarM7451h = k94.m7451h();
                zM13780k = m13780k((dc4) k94.m7466w(dc4Var2, w94Var, e94VarM7451h), i, abstractC0003a2M11354c, true);
            }
            k94.m7455l(e94VarM7451h, w94Var);
        } while (!zM13780k);
        return ((Boolean) objInvoke).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:135:0x020a  */
    /* JADX INFO: renamed from: F */
    public static final long m13761F(int i, String str, int i2) {
        char cCharAt;
        int i3;
        long j;
        char c;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j2;
        char c3;
        int i9;
        int i10;
        int i11;
        long j3 = 4294967295L;
        if (i == i2) {
            return (((long) i) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
        }
        char cCharAt2 = str.charAt(i);
        boolean z = cCharAt2 == '-';
        if (z) {
            i3 = i + 1;
            if (i3 == i2) {
                return (((long) i3) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
            cCharAt = str.charAt(i3);
            if (((char) (cCharAt - '0')) >= '\n' && cCharAt != '.') {
                return (((long) i3) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
        } else {
            cCharAt = cCharAt2;
            i3 = i;
        }
        int length = str.length();
        int i12 = i3;
        long j4 = 0;
        while (true) {
            if (i12 == i2) {
                j = j3;
                break;
            }
            j = j3;
            int i13 = cCharAt - '0';
            if (((char) i13) >= '\n') {
                break;
            }
            j4 = (j4 * 10) + ((long) i13);
            i12++;
            cCharAt = i12 < length ? str.charAt(i12) : (char) 0;
            j3 = j;
        }
        int i14 = i12 - i3;
        char c4 = '0';
        if (i12 == i2 || cCharAt != '.') {
            c = ' ';
            c2 = 1;
            i4 = i12;
            i5 = i4;
            i6 = 0;
        } else {
            int i15 = i12 + 1;
            c = ' ';
            i4 = i15;
            while (true) {
                c2 = 1;
                if (i2 - i4 < 4) {
                    i11 = i15;
                    break;
                }
                i11 = i15;
                long jCharAt = ((long) str.charAt(i4)) | (((long) str.charAt(i4 + 1)) << 16) | (((long) str.charAt(i4 + 2)) << 32) | (((long) str.charAt(i4 + 3)) << 48);
                long j5 = jCharAt - 13511005043687472L;
                int i16 = (((jCharAt + 19703549022044230L) | j5) & (-35747867511423104L)) != 0 ? -1 : (int) ((j5 * 281475406208040961L) >>> 48);
                if (i16 < 0) {
                    break;
                }
                j4 = (j4 * 10000) + ((long) i16);
                i4 += 4;
                i15 = i11;
            }
            char cCharAt3 = i4 < length ? str.charAt(i4) : (char) 0;
            loop2: while (true) {
                cCharAt = cCharAt3;
                while (true) {
                    if (i4 == i2) {
                        break loop2;
                    }
                    int i17 = cCharAt - '0';
                    if (((char) i17) >= '\n') {
                        break loop2;
                    }
                    j4 = (j4 * 10) + ((long) i17);
                    i4++;
                    if (i4 < length) {
                        break;
                    }
                    cCharAt = 0;
                }
                cCharAt3 = str.charAt(i4);
            }
            i6 = i11 - i4;
            i14 -= i6;
            i5 = i11;
        }
        if (i14 == 0) {
            return (((long) i4) << c) | (((long) Float.floatToRawIntBits(Float.NaN)) & j);
        }
        if ((cCharAt | ' ') == 101) {
            i7 = i4 + 1;
            char cCharAt4 = i7 < length ? str.charAt(i7) : (char) 0;
            char c5 = cCharAt4 == '-' ? c2 : (char) 0;
            if (c5 != 0 || cCharAt4 == '+') {
                i7 = i4 + 2;
            }
            char cCharAt5 = str.charAt(i7);
            i8 = 0;
            while (true) {
                if (i7 == i2) {
                    i10 = i6;
                    break;
                }
                int i18 = cCharAt5 - c4;
                i10 = i6;
                if (((char) i18) >= '\n') {
                    break;
                }
                if (i8 < 1024) {
                    i8 = (i8 * 10) + i18;
                }
                i7++;
                cCharAt5 = i7 < length ? str.charAt(i7) : (char) 0;
                i6 = i10;
                c4 = '0';
            }
            if (c5 != 0) {
                i8 = -i8;
            }
            i6 = i10 + i8;
        } else {
            i7 = i4;
            i8 = 0;
        }
        int i19 = 19;
        if (i14 > 19) {
            char cCharAt6 = str.charAt(i3);
            int i20 = i3;
            while (true) {
                if (i7 == i2) {
                    i9 = i19;
                    break;
                }
                if (cCharAt6 != '0' && cCharAt6 != '.') {
                    i9 = 19;
                    break;
                }
                if (cCharAt6 == '0') {
                    i14--;
                }
                i20++;
                cCharAt6 = i20 < length ? str.charAt(i20) : (char) 0;
                i19 = 19;
            }
            if (i14 > i9) {
                char cCharAt7 = str.charAt(i3);
                j2 = 0;
                while (i3 != i12 && Long.compareUnsigned(j2, 1000000000000000000L) < 0) {
                    j2 = (j2 * 10) + ((long) (cCharAt7 - '0'));
                    i3++;
                    cCharAt7 = i3 < length ? str.charAt(i3) : (char) 0;
                }
                if (Long.compareUnsigned(j2, 1000000000000000000L) >= 0) {
                    i6 = (i12 - i3) + i8;
                } else {
                    char cCharAt8 = str.charAt(i5);
                    int i21 = i5;
                    while (i21 != i4 && Long.compareUnsigned(j2, 1000000000000000000L) < 0) {
                        j2 = (j2 * 10) + ((long) (cCharAt8 - '0'));
                        i21++;
                        cCharAt8 = i21 < length ? str.charAt(i21) : (char) 0;
                    }
                    i6 = (i5 - i21) + i8;
                }
                c3 = c2;
            } else {
                j2 = j4;
                c3 = 0;
            }
        } else {
            j2 = j4;
            c3 = 0;
        }
        if (-10 <= i6 && i6 < 11 && c3 == 0 && Long.compareUnsigned(j2, 16777216L) <= 0) {
            float f = j2;
            float[] fArr = f36366b;
            float f2 = i6 < 0 ? f / fArr[-i6] : f * fArr[i6];
            if (z) {
                f2 = -f2;
            }
            return (((long) i7) << c) | (((long) Float.floatToRawIntBits(f2)) & j);
        }
        if (j2 == 0) {
            return (((long) i7) << c) | (((long) Float.floatToRawIntBits(z != 0 ? -0.0f : 0.0f)) & j);
        }
        if (-126 > i6 || i6 >= 128) {
            return (((long) i7) << c) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i, i7)))) & j);
        }
        long j6 = f36367c[i6 + 325];
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j2);
        long j7 = j2 << iNumberOfLeadingZeros;
        long j8 = j7 & j;
        long j9 = j7 >>> c;
        long j10 = j6 & j;
        long j11 = j6 >>> c;
        long j12 = j9 * j11;
        long j13 = j11 * j8;
        long j14 = j12 + ((((j9 * j10) + ((j8 * j10) >>> c)) + (j13 & j)) >>> c) + (j13 >>> c);
        int i22 = (int) (j14 >>> 63);
        long j15 = j14 >>> (i22 + 9);
        int i23 = iNumberOfLeadingZeros + (i22 ^ 1);
        long j16 = j14 & 511;
        if (j16 == 511 || (j16 == 0 && (j15 & 3) == 1)) {
            return (((long) i7) << c) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i, i7)))) & j);
        }
        long j17 = (j15 + 1) >>> c2;
        if (j17 >= 9007199254740992L) {
            i23--;
            j17 = 4503599627370496L;
        }
        long j18 = j17 & (-4503599627370497L);
        long j19 = (((((long) i6) * 217706) >> 16) + 1087) - ((long) i23);
        if (j19 < 1 || j19 > 2046) {
            return (((long) i7) << c) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i, i7)))) & j);
        }
        return (((long) i7) << c) | (((long) Float.floatToRawIntBits((float) Double.longBitsToDouble((j19 << 52) | j18 | (z != 0 ? Long.MIN_VALUE : 0L)))) & j);
    }

    /* JADX INFO: renamed from: G */
    public static ba2 m13762G(kb2 kb2Var) {
        boolean z;
        try {
            try {
                kb2Var.mo7481R();
                z = false;
                try {
                    return (ba2) zr4.f36319z.mo166b(kb2Var);
                } catch (EOFException e) {
                    e = e;
                    if (z) {
                        return sa2.f30035a;
                    }
                    throw new lb2(e);
                }
            } catch (IOException e2) {
                throw new ia2(e2);
            } catch (NumberFormatException e3) {
                throw new lb2(e3);
            } catch (op2 e4) {
                throw new lb2(e4);
            }
        } catch (EOFException e5) {
            e = e5;
            z = true;
        }
    }

    /* JADX INFO: renamed from: I */
    public static Object m13763I(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public static final void m13764J(C1242v3 c1242v3, i14 i14Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1242v3.f32353a;
        Object objM8132g = i14Var.m6549k().f17631a.m8132g(m14.f24557f);
        if (objM8132g == null) {
            objM8132g = null;
        }
        cb0 cb0Var = (cb0) objM8132g;
        if (cb0Var != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(cb0Var.f15910a, cb0Var.f15911b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object objM8132g2 = i14Var.m6549k().f17631a.m8132g(m14.f24556e);
        if ((objM8132g2 != null ? objM8132g2 : null) != null) {
            List listM6548i = i14Var.m6548i((4 & 1) != 0 ? !i14Var.f21010b : false, (4 & 2) == 0);
            int size = listM6548i.size();
            for (int i = 0; i < size; i++) {
                i14 i14Var2 = (i14) listM6548i.get(i);
                if (i14Var2.m6549k().f17631a.m8128c(m14.f24543J)) {
                    arrayList.add(i14Var2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zM13782m = m13782m(arrayList);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zM13782m ? 1 : arrayList.size(), zM13782m ? arrayList.size() : 1, false, 0));
    }

    /* JADX INFO: renamed from: K */
    public static final void m13765K(C1242v3 c1242v3, i14 i14Var) {
        Object objM8132g = i14Var.m6549k().f17631a.m8132g(m14.f24558g);
        if (objM8132g == null) {
            objM8132g = null;
        }
        if (objM8132g != null) {
            xy4.m12778e();
            return;
        }
        i14 i14VarM6550l = i14Var.m6550l();
        if (i14VarM6550l == null) {
            return;
        }
        Object objM8132g2 = i14VarM6550l.m6549k().f17631a.m8132g(m14.f24556e);
        if (objM8132g2 == null) {
            objM8132g2 = null;
        }
        if (objM8132g2 != null) {
            Object objM8132g3 = i14VarM6550l.m6549k().f17631a.m8132g(m14.f24557f);
            cb0 cb0Var = (cb0) (objM8132g3 != null ? objM8132g3 : null);
            if (cb0Var == null || (cb0Var.f15910a >= 0 && cb0Var.f15911b >= 0)) {
                if (i14Var.m6549k().f17631a.m8128c(m14.f24543J)) {
                    ArrayList arrayList = new ArrayList();
                    List listM6548i = i14VarM6550l.m6548i((4 & 1) != 0 ? !i14VarM6550l.f21010b : false, (4 & 2) == 0);
                    int size = listM6548i.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        i14 i14Var2 = (i14) listM6548i.get(i2);
                        if (i14Var2.m6549k().f17631a.m8128c(m14.f24543J)) {
                            arrayList.add(i14Var2);
                            if (i14Var2.f21011c.m12296w() < i14Var.f21011c.m12296w()) {
                                i++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zM13782m = m13782m(arrayList);
                    int i3 = zM13782m ? 0 : i;
                    int i4 = zM13782m ? i : 0;
                    Object objM8132g4 = i14Var.m6549k().f17631a.m8132g(m14.f24543J);
                    if (objM8132g4 == null) {
                        objM8132g4 = Boolean.FALSE;
                    }
                    c1242v3.f32353a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i3, 1, i4, 1, false, ((Boolean) objM8132g4).booleanValue()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public static final long m13766L(long j, long j2) {
        int iM9901e;
        int iM9903g = ql4.m9903g(j);
        int iM9902f = ql4.m9902f(j);
        if ((ql4.m9903g(j2) < ql4.m9902f(j)) && (ql4.m9903g(j) < ql4.m9902f(j2))) {
            if ((ql4.m9903g(j2) <= ql4.m9903g(j)) && (ql4.m9902f(j) <= ql4.m9902f(j2))) {
                iM9903g = ql4.m9903g(j2);
                iM9902f = iM9903g;
            } else {
                if ((ql4.m9903g(j) <= ql4.m9903g(j2)) && (ql4.m9902f(j2) <= ql4.m9902f(j))) {
                    iM9901e = ql4.m9901e(j2);
                } else {
                    int iM9903g2 = ql4.m9903g(j2);
                    if (iM9903g >= ql4.m9902f(j2) || iM9903g2 > iM9903g) {
                        iM9902f = ql4.m9903g(j2);
                    } else {
                        iM9903g = ql4.m9903g(j2);
                        iM9901e = ql4.m9901e(j2);
                    }
                }
                iM9902f -= iM9901e;
            }
        } else if (iM9902f > ql4.m9903g(j2)) {
            iM9903g -= ql4.m9901e(j2);
            iM9901e = ql4.m9901e(j2);
            iM9902f -= iM9901e;
        }
        return sc6.m10657b(iM9903g, iM9902f);
    }

    /* JADX INFO: renamed from: M */
    public static final void m13767M(int i, int i2) {
        if (i < 0 || i >= i2) {
            xy4.m12792u(d55.m4367l("index (", i, ") is out of bound of [0, ", i2, ")"));
        }
    }

    /* JADX INFO: renamed from: N */
    public static final Object m13768N(ym0 ym0Var) {
        Object obj;
        ro0 context = ym0Var.getContext();
        y70.m13040t(context);
        wm0 wm0VarM86x = C0006a5.m86x(ym0Var);
        f01 f01Var = wm0VarM86x instanceof f01 ? (f01) wm0VarM86x : null;
        ju4 ju4Var = ju4.f22634a;
        if (f01Var == null) {
            obj = ju4Var;
        } else {
            so0 so0Var = f01Var.f18626d;
            if (g01.m5869c(so0Var, context)) {
                f01Var.f18628f = ju4Var;
                f01Var.f20971c = 1;
                so0Var.mo6175L(context, f01Var);
            } else {
                ro0 ro0VarPlus = context.plus(new o45(o45.f26338b));
                f01Var.f18628f = ju4Var;
                f01Var.f20971c = 1;
                so0Var.mo6175L(ro0VarPlus, f01Var);
            }
            obj = ap0.f14763a;
        }
        return obj == ap0.f14763a ? obj : ju4Var;
    }

    /* JADX INFO: renamed from: O */
    public static synchronized void m13769O(Context context, ArrayList arrayList) {
        try {
            int i = 0;
            SharedPreferences sharedPreferences = context.getSharedPreferences("hsdp_report_cache", 0);
            HashSet hashSet = new HashSet(sharedPreferences.getStringSet("pending_reports", new HashSet()));
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                yx1 yx1Var = (yx1) obj;
                hashSet.remove(yx1Var.f35581a + ':' + yx1Var.f35582b + ':' + yx1Var.f35583c);
            }
            sharedPreferences.edit().putStringSet("pending_reports", hashSet).apply();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m13770a(pg0 pg0Var, mi0 mi0Var, int i) {
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-709502251);
        byte b = 5;
        if (ir1Var.m6871T(i & 1, (i & 3) != 2)) {
            nc4 nc4Var = ou3.f27125a;
            lu3 lu3Var = (lu3) ir1Var.m6898k(nc4Var);
            iu3 iu3VarM6066D = gq6.m6066D(ir1Var);
            Object[] objArr = {lu3Var};
            en0 en0Var = new en0((byte) 23);
            na1 na1Var = new na1((byte) 10);
            na1Var.f25595b = lu3Var;
            na1Var.f25596c = iu3VarM6066D;
            VarHandle.storeStoreFence();
            yg3 yg3VarM5407a = ev3.m5407a(en0Var, na1Var);
            boolean zM6894i = ir1Var.m6894i(lu3Var) | ir1Var.m6894i(iu3VarM6066D);
            Object objM6869O = ir1Var.m6869O();
            if (zM6894i || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                jp1 jp1Var = new jp1(b);
                jp1Var.f22485b = lu3Var;
                jp1Var.f22486c = iu3VarM6066D;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(jp1Var);
                obj = jp1Var;
            }
            obj = objM6869O;
            vi2 vi2Var = (vi2) dt0.m4688Q(objArr, yg3VarM5407a, (wp1) obj, ir1Var, 0);
            zh3 zh3VarMo7523a = nc4Var.mo7523a(vi2Var);
            er1 er1Var = new er1(b);
            er1Var.f18412b = pg0Var;
            er1Var.f18413c = vi2Var;
            VarHandle.storeStoreFence();
            as4.m3244c(zh3VarMo7523a, vd6.m11834R(-412824043, er1Var, ir1Var), ir1Var, 56);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            h02 h02Var = new h02(b);
            h02Var.f20244b = pg0Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = h02Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m13771b(int i, pg0 pg0Var, mi0 mi0Var, int i2, int i3) {
        int i4;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(706213499);
        int i5 = i3 & 1;
        byte b = 2;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (ir1Var.m6886e(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        byte b2 = 1;
        if (ir1Var.m6871T(i4 & 1, (i4 & 19) != 18)) {
            int i6 = i5 != 0 ? 0 : i;
            Object objM6869O = ir1Var.m6869O();
            wm0 wm0Var = null;
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                objM6869O = z44.m13332b(1, 5, null);
                ir1Var.m6905n0(objM6869O);
            }
            qw2 qw2Var = (qw2) objM6869O;
            Object objM6869O2 = ir1Var.m6869O();
            if (objM6869O2 == i50Var) {
                objM6869O2 = new a83(0);
                ir1Var.m6905n0(objM6869O2);
            }
            a83 a83Var = (a83) objM6869O2;
            boolean zM6894i = ir1Var.m6894i(qw2Var);
            Object objM6869O3 = ir1Var.m6869O();
            if (zM6894i || objM6869O3 == i50Var) {
                objM6869O3 = new it1((Object) qw2Var, (Object) a83Var, wm0Var, (byte) 9);
                ir1Var.m6905n0(objM6869O3);
            }
            ju4 ju4Var = ju4.f22634a;
            lb5.m7926g(ir1Var, (mq1) objM6869O3, ju4Var);
            Object objM6869O4 = ir1Var.m6869O();
            if (objM6869O4 == i50Var) {
                we2 we2Var = new we2(b2);
                we2Var.f33269b = a83Var;
                VarHandle.storeStoreFence();
                objM6869O4 = s94.m10566b(we2Var);
                ir1Var.m6905n0(objM6869O4);
            }
            xb4 xb4Var = (xb4) objM6869O4;
            boolean zM6894i2 = ir1Var.m6894i(qw2Var);
            Object objM6869O5 = ir1Var.m6869O();
            Object obj = objM6869O5;
            if (zM6894i2 || objM6869O5 == i50Var) {
                C1252vd c1252vd = new C1252vd(b);
                c1252vd.f32529b = qw2Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c1252vd);
                obj = c1252vd;
            }
            nt2 nt2VarM10327a = rf4.m10327a(kt2.f23428a, ju4Var, (PointerInputEventHandler) obj);
            Object objM6869O6 = ir1Var.m6869O();
            if (objM6869O6 == i50Var) {
                objM6869O6 = k43.m7398w(Boolean.FALSE);
                ir1Var.m6905n0(objM6869O6);
            }
            sw2 sw2Var = (sw2) objM6869O6;
            hh4 hh4Var = hh4.f20583a;
            boolean z = !gh4.m6005a((a44) ir1Var.m6898k(h44.m6217a()));
            nh2 nh2Var = new nh2(b2);
            nh2Var.f25805b = nt2VarM10327a;
            nh2Var.f25806c = sw2Var;
            nh2Var.f25807d = xb4Var;
            nh2Var.f25808e = pg0Var;
            VarHandle.storeStoreFence();
            c20.m3811f(hh4Var, false, i6, z, vd6.m11834R(-157371509, nh2Var, ir1Var), ir1Var, 196614 | ((i4 << 6) & 896), 18);
            boolean zBooleanValue = ((Boolean) sw2Var.getValue()).booleanValue();
            C0928n c0928n = new C0928n((byte) 14);
            c0928n.f25353b = nt2VarM10327a;
            VarHandle.storeStoreFence();
            c20.m3811f(hh4Var, zBooleanValue, 0, true, vd6.m11834R(613692148, c0928n, ir1Var), ir1Var, 199686, 20);
            i = i6;
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ay2 ay2Var = new ay2();
            ay2Var.f14943a = i;
            ay2Var.f14944b = pg0Var;
            ay2Var.f14945c = i2;
            ay2Var.f14946d = i3;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ay2Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final long m13772c(zx2 zx2Var, int i) {
        int iOrdinal = zx2Var.f36443a.ordinal();
        if (iOrdinal == 0) {
            return ((long) (-i)) << 32;
        }
        if (iOrdinal == 1) {
            return ((long) i) << 32;
        }
        if (iOrdinal == 2) {
            return ((long) i) & 4294967295L;
        }
        C0670g.m5864c();
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:192:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:208:0x041d  */
    /* JADX WARN: Code duplicated, block: B:220:0x045c  */
    /* JADX WARN: Code duplicated, block: B:221:0x0466  */
    /* JADX WARN: Code duplicated, block: B:223:0x0471  */
    /* JADX WARN: Code duplicated, block: B:224:0x0478  */
    /* JADX WARN: Code duplicated, block: B:227:0x0489  */
    /* JADX WARN: Code duplicated, block: B:228:0x048e  */
    /* JADX WARN: Code duplicated, block: B:230:0x0499  */
    /* JADX WARN: Code duplicated, block: B:231:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:233:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:236:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:238:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:240:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:247:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:251:0x0502  */
    /* JADX WARN: Code duplicated, block: B:260:0x0513  */
    /* JADX WARN: Code duplicated, block: B:263:0x0555  */
    /* JADX WARN: Code duplicated, block: B:265:0x055b  */
    /* JADX WARN: Code duplicated, block: B:268:0x0569  */
    /* JADX WARN: Code duplicated, block: B:272:0x058e  */
    /* JADX WARN: Code duplicated, block: B:274:0x059d A[LOOP:8: B:273:0x059b->B:274:0x059d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:277:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:279:0x05be  */
    /* JADX WARN: Code duplicated, block: B:281:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:283:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:284:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:286:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:288:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:297:0x0614  */
    /* JADX WARN: Code duplicated, block: B:302:0x0631  */
    /* JADX WARN: Code duplicated, block: B:304:0x063d  */
    /* JADX WARN: Code duplicated, block: B:306:0x0643  */
    /* JADX WARN: Code duplicated, block: B:311:0x0651  */
    /* JADX WARN: Code duplicated, block: B:366:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:368:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:370:0x0804  */
    /* JADX WARN: Code duplicated, block: B:372:0x080a  */
    /* JADX WARN: Code duplicated, block: B:377:0x0818  */
    /* JADX WARN: Code duplicated, block: B:391:0x086c  */
    /* JADX WARN: Code duplicated, block: B:393:0x087d  */
    /* JADX WARN: Code duplicated, block: B:394:0x0881  */
    /* JADX WARN: Code duplicated, block: B:396:0x088c  */
    /* JADX WARN: Code duplicated, block: B:399:0x0896 A[LOOP:6: B:398:0x0894->B:399:0x0896, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:402:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:404:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:406:0x08c3  */
    /* JADX WARN: Code duplicated, block: B:408:0x08c7 A[LOOP:7: B:405:0x08c1->B:408:0x08c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:413:0x08da  */
    /* JADX WARN: Code duplicated, block: B:415:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:418:0x0900  */
    /* JADX WARN: Code duplicated, block: B:430:0x04fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x08cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:0x0603 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:4:0x004c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0051  */
    /* JADX WARN: Instruction removed from duplicated block: B:404:0x08b5, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static final C0452af m13773d(String str, xl4 xl4Var, List list, ky0 ky0Var, am1 am1Var, List list2, boolean z) {
        Locale locale;
        int i;
        Object obj;
        long j;
        long j2;
        pa4 pa4Var;
        int length;
        int i2;
        al4 al4Var;
        C0452af c0452af;
        ArrayList arrayList;
        List list3;
        int size;
        int i3;
        bm1 bm1Var;
        pa4 pa4Var2;
        up4 up4Var;
        int size2;
        int i4;
        int[] iArr;
        int size3;
        int i5;
        Collection collection;
        int i6;
        int i7;
        int i8;
        int size4;
        pa4 pa4Var3;
        int i9;
        ArrayList arrayList2;
        pa4 pa4Var4;
        ky0 ky0Var2;
        int i10;
        int i11;
        ky0 ky0Var3;
        int size5;
        boolean z2;
        int i12;
        C0452af c0452af2;
        ky0 ky0Var4;
        al4 al4Var2;
        int size6;
        int i13;
        C0452af c0452af3;
        C0838kk c0838kk;
        int i14;
        long j3;
        long jM3633c;
        int size7;
        int i15;
        C0838kk c0838kk2;
        InterfaceC0728hk interfaceC0728hk;
        int i16;
        int i17;
        Object obj2;
        C0838kk c0838kk3;
        Object obj3;
        C0452af c0452af4;
        ky0 ky0Var5;
        int i18;
        int i19;
        boolean z3;
        int i20;
        pa4 pa4VarM9445c;
        C0838kk c0838kk4;
        Object obj4;
        pa4 pa4Var5;
        long j4;
        long j5;
        long jM3633c2;
        float fM3634d;
        long jM3633c3;
        float fM3634d2;
        mb3 mb3Var;
        CharSequence charSequence;
        List list4 = list;
        C0452af c0452af5 = new C0452af();
        c0452af5.f14417a = str;
        c0452af5.f14418b = xl4Var;
        c0452af5.f14419c = list2;
        c0452af5.f14420d = am1Var;
        c0452af5.f14421e = ky0Var;
        float fMo3580c = ky0Var.mo3580c();
        byte b = 1;
        C0798jh c0798jh = new C0798jh(1);
        ((TextPaint) c0798jh).density = fMo3580c;
        c0798jh.f22261b = uj4.f31938b;
        c0798jh.f22262c = (byte) 3;
        c0798jh.f22263d = m44.f24642d;
        c0452af5.f14422f = c0798jh;
        m13790w(xl4Var);
        pa4 pa4Var6 = xl4Var.f34389a;
        r73 r73Var = xl4Var.f34390b;
        c0452af5.f14426j = false;
        int i21 = r73Var.f29065b;
        zm2 zm2Var = pa4Var6.f27488k;
        xm1 xm1Var = pa4Var6.f27480c;
        tm1 tm1Var = pa4Var6.f27481d;
        if (i21 == 4) {
            i = 2;
        } else if (i21 == 5) {
            i = 3;
        } else if (i21 == 1) {
            i = 0;
        } else if (i21 == 2) {
            i = 1;
        } else {
            if (i21 != 3 && i21 != 0) {
                C1077qn.m9989o("Invalid TextDirection.");
                return null;
            }
            if (zm2Var == null || (locale = ((ym2) zm2Var.f36183a.get(0)).f35328a) == null) {
                locale = Locale.getDefault();
            }
            int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale(locale);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                i = 2;
            } else {
                i = 3;
            }
        }
        c0452af5.f14427k = i;
        c0452af5.f14428l = -1;
        C0750i5 c0750i5 = new C0750i5(b);
        c0750i5.f21129b = c0452af5;
        VarHandle.storeStoreFence();
        ol4 ol4Var = r73Var.f29072i;
        if (ol4Var == null) {
            ol4Var = ol4.f26852c;
        }
        c0798jh.setFlags(ol4Var.f26855b ? c0798jh.getFlags() | 128 : c0798jh.getFlags() & (-129));
        int i22 = ol4Var.f26854a;
        if (i22 == 1) {
            c0798jh.setFlags(c0798jh.getFlags() | 64);
            c0798jh.setHinting(0);
        } else if (i22 == 2) {
            c0798jh.getFlags();
            c0798jh.setHinting(1);
        } else if (i22 == 3) {
            c0798jh.getFlags();
            c0798jh.setHinting(0);
        } else {
            c0798jh.getFlags();
        }
        int size8 = list4.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size8) {
                obj = null;
                break;
            }
            obj = list4.get(i23);
            if (((C0838kk) obj).f23186a instanceof pa4) {
                break;
            }
            i23++;
        }
        boolean z4 = obj != null;
        long j6 = pa4Var6.f27479b;
        String str2 = pa4Var6.f27484g;
        zm2 zm2Var2 = pa4Var6.f27488k;
        yk4 yk4Var = pa4Var6.f27478a;
        zk4 zk4Var = pa4Var6.f27487j;
        boolean z5 = z4;
        long j7 = pa4Var6.f27485h;
        long jM3633c4 = bm4.m3633c(j6);
        if (cm4.m4048b(jM3633c4, 4294967296L)) {
            c0798jh.setTextSize(ky0Var.mo3582h0(j6));
        } else if (cm4.m4048b(jM3633c4, 8589934592L)) {
            c0798jh.setTextSize(bm4.m3634d(j6) * c0798jh.getTextSize());
        }
        bm1 bm1Var2 = pa4Var6.f27483f;
        if (bm1Var2 != null || tm1Var != null || xm1Var != null) {
            if (xm1Var == null) {
                xm1Var = xm1.f34413f;
            }
            tm1 tm1VarM11064a = tm1.m11064a(tm1Var != null ? tm1Var.f31237a : 0);
            um1 um1Var = pa4Var6.f27482e;
            c0798jh.setTypeface((Typeface) c0750i5.mo183g(bm1Var2, xm1Var, tm1VarM11064a, um1.m11584a(um1Var != null ? um1Var.f31990a : 65535)));
        }
        if (zm2Var2 != null) {
            zm2 zm2Var3 = zm2.f36182c;
            if (!zm2Var2.equals(kb3.f23056a.m7249x())) {
                ArrayList arrayList3 = new ArrayList(ib0.m6717y0(zm2Var2, 10));
                Iterator it = zm2Var2.f36183a.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((ym2) it.next()).f35328a);
                }
                Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                c0798jh.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        }
        if (str2 != null && !str2.equals("")) {
            c0798jh.setFontFeatureSettings(str2);
        }
        if (zk4Var != null && !zk4Var.equals(zk4.f36160c)) {
            c0798jh.setTextScaleX(c0798jh.getTextScaleX() * zk4Var.f36161a);
            c0798jh.setTextSkewX(c0798jh.getTextSkewX() + zk4Var.f36162b);
        }
        c0798jh.m7111d(yk4Var.mo5689a());
        c0798jh.m7110c(yk4Var.mo5690f(), 9205357640488583168L, yk4Var.mo5691h());
        c0798jh.m7113f(pa4Var6.f27491n);
        c0798jh.m7114g(pa4Var6.f27490m);
        c0798jh.m7112e(pa4Var6.f27492o);
        if (!cm4.m4048b(bm4.m3633c(j7), 4294967296L) || bm4.m3634d(j7) == 0.0f) {
            j = j7;
            j2 = 9205357640488583168L;
            if (cm4.m4048b(bm4.m3633c(j), 8589934592L)) {
                c0798jh.setLetterSpacing(bm4.m3634d(j));
            }
        } else {
            float textScaleX = c0798jh.getTextScaleX() * c0798jh.getTextSize();
            j = j7;
            float fMo3582h0 = ky0Var.mo3582h0(j);
            if (textScaleX != 0.0f) {
                c0798jh.setLetterSpacing(fMo3582h0 / textScaleX);
            }
            j2 = 9205357640488583168L;
        }
        long j8 = pa4Var6.f27489l;
        C0471ay c0471ay = pa4Var6.f27486i;
        boolean z6 = z5 && cm4.m4048b(bm4.m3633c(j), 4294967296L) && bm4.m3634d(j) != 0.0f;
        long j9 = pb0.f27501h;
        boolean z7 = (ws4.m12408a(j8, j9) || ws4.m12408a(j8, pb0.f27500g)) ? false : true;
        boolean z8 = (c0471ay == null || Float.compare(c0471ay.f14938a, 0.0f) == 0) ? false : true;
        if (z6 || z7 || z8) {
            if (!z6) {
                j = bm4.f15419c;
            }
            pa4Var = new pa4(0L, 0L, (xm1) null, (tm1) null, (um1) null, (bm1) null, (String) null, j, z8 ? c0471ay : null, (zk4) null, (zm2) null, z7 ? j8 : j9, (uj4) null, (m44) null, 63103);
        } else {
            pa4Var = null;
        }
        if (pa4Var != null) {
            int size9 = list4.size() + 1;
            ArrayList arrayList4 = new ArrayList(size9);
            int i24 = 0;
            while (i24 < size9) {
                arrayList4.add(i24 == 0 ? new C0838kk(0, str.length(), pa4Var) : (C0838kk) list4.get(i24 - 1));
                i24++;
            }
            list4 = arrayList4;
        }
        float textSize = c0798jh.getTextSize();
        xl4 xl4Var2 = c0452af5.f14418b;
        List list5 = c0452af5.f14419c;
        ky0 ky0Var6 = c0452af5.f14421e;
        String str3 = c0452af5.f14417a;
        if (c0452af5.f14428l == -1) {
            c0452af5.f14428l = (str3.length() > 512 || hd4.m6336b0(str3, '\n')) ? 1 : 0;
        }
        C1365ye c1365ye = AbstractC1402ze.f36008a;
        if (list4.isEmpty() && list5.isEmpty() && z62.m13387o(xl4Var2.f34390b.f29067d, al4.f14615c) && (xl4Var2.f34390b.f29066c & 1095216660480L) == 0) {
            charSequence = str;
            c0452af3 = c0452af5;
        } else {
            Spannable spannableString = str instanceof Spannable ? (Spannable) str : new SpannableString(str);
            pa4 pa4Var7 = xl4Var2.f34389a;
            r73 r73Var2 = xl4Var2.f34390b;
            if (z62.m13387o(pa4Var7.f27490m, uj4.f31939c)) {
                spannableString.setSpan(AbstractC1402ze.f36008a, 0, str.length(), 33);
            }
            zb3 zb3Var = xl4Var2.f34391c;
            if (((zb3Var == null || (mb3Var = zb3Var.f35919a) == null) ? false : mb3Var.f24799a) && r73Var2.f29069f == null) {
                float fM51G = C0006a5.m51G(r73Var2.f29066c, textSize, ky0Var6);
                if (!Float.isNaN(fM51G)) {
                    zk2 zk2Var = new zk2();
                    zk2Var.f36159a = fM51G;
                    VarHandle.storeStoreFence();
                    spannableString.setSpan(zk2Var, 0, spannableString.length(), 33);
                }
            } else {
                dl2 dl2Var = r73Var2.f29069f;
                if (dl2Var == null) {
                    dl2Var = dl2.f17143d;
                }
                float fM51G2 = C0006a5.m51G(r73Var2.f29066c, textSize, ky0Var6);
                if (!Float.isNaN(fM51G2)) {
                    if (spannableString.length() == 0) {
                        length = spannableString.length() + 1;
                    } else {
                        if (spannableString.length() == 0) {
                            ds3.m4667k("Char sequence is empty.");
                            return null;
                        }
                        if (spannableString.charAt(hd4.m6339e0(spannableString)) == '\n') {
                            length = spannableString.length() + 1;
                        } else {
                            length = spannableString.length();
                        }
                    }
                    int i25 = length;
                    int i26 = dl2Var.f17145b;
                    i2 = 0;
                    spannableString.setSpan(new el2(fM51G2, i25, (i26 & 1) > 0, (i26 & 16) > 0, dl2Var.f17144a, dl2Var.f17146c), 0, spannableString.length(), 33);
                }
                al4Var = r73Var2.f29067d;
                if (al4Var != null) {
                    j4 = al4Var.f14616a;
                    c0452af = c0452af5;
                    j5 = al4Var.f14617b;
                    if ((bm4.m3632b(j4, vd6.m11817A(i2)) || !bm4.m3632b(j5, vd6.m11817A(i2))) && (j4 & 1095216660480L) != 0 && (j5 & 1095216660480L) != 0) {
                        jM3633c2 = bm4.m3633c(j4);
                        if (cm4.m4048b(jM3633c2, 4294967296L)) {
                            fM3634d = ky0Var6.mo3582h0(j4);
                        } else if (cm4.m4048b(jM3633c2, 8589934592L)) {
                            fM3634d = bm4.m3634d(j4) * textSize;
                        } else {
                            fM3634d = 0.0f;
                        }
                        jM3633c3 = bm4.m3633c(j5);
                        if (cm4.m4048b(jM3633c3, 4294967296L)) {
                            fM3634d2 = ky0Var6.mo3582h0(j5);
                        } else if (cm4.m4048b(jM3633c3, 8589934592L)) {
                            fM3634d2 = bm4.m3634d(j5) * textSize;
                        } else {
                            fM3634d2 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fM3634d), (int) Math.ceil(fM3634d2)), 0, spannableString.length(), 33);
                    }
                    arrayList = new ArrayList(list4.size());
                    list3 = list4;
                    size = list3.size();
                    for (i3 = 0; i3 < size; i3++) {
                        c0838kk4 = (C0838kk) list4.get(i3);
                        obj4 = c0838kk4.f23186a;
                        if (obj4 instanceof pa4) {
                            pa4Var5 = (pa4) obj4;
                            if (pa4Var5.f27483f == null || pa4Var5.f27481d != null || pa4Var5.f27480c != null || ((pa4) obj4).f27482e != null) {
                                arrayList.add(c0838kk4);
                            }
                        }
                    }
                    bm1Var = pa4Var7.f27483f;
                    if (bm1Var != null && pa4Var7.f27481d == null && pa4Var7.f27480c == null && pa4Var7.f27482e == null) {
                        pa4Var2 = null;
                    } else {
                        pa4Var2 = new pa4(0L, 0L, pa4Var7.f27480c, pa4Var7.f27481d, pa4Var7.f27482e, bm1Var, (String) null, 0L, (C0471ay) null, (zk4) null, (zm2) null, 0L, (uj4) null, (m44) null, 65475);
                    }
                    up4Var = new up4((byte) 9);
                    up4Var.f32065b = spannableString;
                    up4Var.f32066c = c0750i5;
                    VarHandle.storeStoreFence();
                    if (arrayList.size() <= 1) {
                        if (!arrayList.isEmpty()) {
                            pa4VarM9445c = (pa4) ((C0838kk) arrayList.get(0)).f23186a;
                            if (pa4Var2 != null) {
                                pa4VarM9445c = pa4Var2.m9445c(pa4VarM9445c);
                            }
                            up4Var.invoke(pa4VarM9445c, Integer.valueOf(((C0838kk) arrayList.get(0)).f23187b), Integer.valueOf(((C0838kk) arrayList.get(0)).f23188c));
                        }
                        collection = list3;
                    } else {
                        size2 = arrayList.size();
                        i4 = size2 * 2;
                        iArr = new int[i4];
                        size3 = arrayList.size();
                        i5 = 0;
                        while (i5 < size3) {
                            C0838kk c0838kk5 = (C0838kk) arrayList.get(i5);
                            iArr[i5] = c0838kk5.f23187b;
                            iArr[i5 + size2] = c0838kk5.f23188c;
                            i5++;
                            list3 = list3;
                        }
                        collection = list3;
                        if (i4 > 1) {
                            Arrays.sort(iArr);
                        }
                        if (i4 != 0) {
                            ds3.m4667k("Array is empty.");
                            return null;
                        }
                        i6 = iArr[0];
                        i7 = 0;
                        while (i7 < i4) {
                            i8 = iArr[i7];
                            if (i8 == i6) {
                                arrayList2 = arrayList;
                                pa4Var4 = pa4Var2;
                                ky0Var2 = ky0Var6;
                            } else {
                                size4 = arrayList.size();
                                pa4Var3 = pa4Var2;
                                i9 = 0;
                                while (i9 < size4) {
                                    ArrayList arrayList5 = arrayList;
                                    C0838kk c0838kk6 = (C0838kk) arrayList.get(i9);
                                    pa4 pa4Var8 = pa4Var2;
                                    i10 = c0838kk6.f23187b;
                                    ky0 ky0Var7 = ky0Var6;
                                    i11 = c0838kk6.f23188c;
                                    if (i10 == i11 && AbstractC0912mk.m8336b(i6, i8, i10, i11)) {
                                        pa4 pa4VarM9445c2 = (pa4) c0838kk6.f23186a;
                                        if (pa4Var3 != null) {
                                            pa4VarM9445c2 = pa4Var3.m9445c(pa4VarM9445c2);
                                        }
                                        pa4Var3 = pa4VarM9445c2;
                                    }
                                    i9++;
                                    arrayList = arrayList5;
                                    pa4Var2 = pa4Var8;
                                    ky0Var6 = ky0Var7;
                                }
                                arrayList2 = arrayList;
                                pa4Var4 = pa4Var2;
                                ky0Var2 = ky0Var6;
                                if (pa4Var3 != null) {
                                    up4Var.invoke(pa4Var3, Integer.valueOf(i6), Integer.valueOf(i8));
                                }
                                i6 = i8;
                            }
                            i7++;
                            arrayList = arrayList2;
                            pa4Var2 = pa4Var4;
                            ky0Var6 = ky0Var2;
                        }
                    }
                    ky0Var3 = ky0Var6;
                    size5 = collection.size();
                    z2 = false;
                    i12 = 0;
                    while (i12 < size5) {
                        c0838kk3 = (C0838kk) list4.get(i12);
                        obj3 = c0838kk3.f23186a;
                        if (obj3 instanceof pa4) {
                            i18 = c0838kk3.f23187b;
                            int i27 = c0838kk3.f23188c;
                            if (i18 >= 0 || i18 >= spannableString.length() || i27 <= i18 || i27 > spannableString.length()) {
                                size5 = size5;
                                c0452af4 = c0452af;
                                i12 = i12;
                                ky0Var5 = ky0Var3;
                            } else {
                                pa4 pa4Var9 = (pa4) obj3;
                                long j10 = pa4Var9.f27485h;
                                C0471ay c0471ay2 = pa4Var9.f27486i;
                                yk4 yk4Var2 = pa4Var9.f27478a;
                                if (c0471ay2 != null) {
                                    float f = c0471ay2.f14938a;
                                    C0555cy c0555cy = new C0555cy((byte) 0);
                                    c0555cy.f16594b = f;
                                    VarHandle.storeStoreFence();
                                    spannableString.setSpan(c0555cy, i18, i27, 33);
                                }
                                C0006a5.m54J(spannableString, yk4Var2.mo5689a(), i18, i27);
                                t30 t30VarMo5690f = yk4Var2.mo5690f();
                                float fMo5691h = yk4Var2.mo5691h();
                                if (t30VarMo5690f != null) {
                                    if (t30VarMo5690f instanceof ga4) {
                                        C0006a5.m54J(spannableString, ((ga4) t30VarMo5690f).f19691a, i18, i27);
                                    } else {
                                        l44 l44Var = new l44();
                                        l44Var.f23783a = (u30) t30VarMo5690f;
                                        l44Var.f23784b = fMo5691h;
                                        l44Var.f23785c = k43.m7398w(h74.m6269a(j2));
                                        g32 g32Var = new g32((byte) 25);
                                        g32Var.f19558b = l44Var;
                                        VarHandle.storeStoreFence();
                                        l44Var.f23786d = s94.m10566b(g32Var);
                                        VarHandle.storeStoreFence();
                                        spannableString.setSpan(l44Var, i18, i27, 33);
                                    }
                                }
                                uj4 uj4Var = pa4Var9.f27490m;
                                if (uj4Var != null) {
                                    int i28 = uj4Var.f31941a;
                                    boolean z9 = (i28 | 1) == i28;
                                    boolean z10 = (i28 | 2) == i28;
                                    vj4 vj4Var = new vj4();
                                    vj4Var.f32682a = z9;
                                    vj4Var.f32683b = z10;
                                    VarHandle.storeStoreFence();
                                    i19 = 33;
                                    spannableString.setSpan(vj4Var, i18, i27, 33);
                                } else {
                                    i19 = 33;
                                }
                                C0006a5.m55K(spannableString, pa4Var9.f27479b, ky0Var3, i18, i27);
                                ky0Var5 = ky0Var3;
                                String str4 = pa4Var9.f27484g;
                                if (str4 != null) {
                                    em1 em1Var = new em1((byte) 0);
                                    em1Var.f18257b = str4;
                                    VarHandle.storeStoreFence();
                                    spannableString.setSpan(em1Var, i18, i27, i19);
                                }
                                zk4 zk4Var2 = pa4Var9.f27487j;
                                if (zk4Var2 != null) {
                                    spannableString.setSpan(new ScaleXSpan(zk4Var2.f36161a), i18, i27, i19);
                                    float f2 = zk4Var2.f36162b;
                                    z3 = true;
                                    C0555cy c0555cy2 = new C0555cy((byte) 1);
                                    c0555cy2.f16594b = f2;
                                    VarHandle.storeStoreFence();
                                    spannableString.setSpan(c0555cy2, i18, i27, i19);
                                } else {
                                    z3 = true;
                                }
                                C0006a5.m56L(spannableString, pa4Var9.f27488k, i18, i27);
                                c0452af4 = c0452af;
                                long j11 = pa4Var9.f27489l;
                                if (j11 != 16) {
                                    spannableString.setSpan(new BackgroundColorSpan(zy5.m13858V(j11)), i18, i27, 33);
                                }
                                m44 m44Var = pa4Var9.f27491n;
                                if (m44Var != null) {
                                    long j12 = m44Var.f24644b;
                                    int iM13858V = zy5.m13858V(m44Var.f24643a);
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L));
                                    float f3 = m44Var.f24645c;
                                    if (f3 == 0.0f) {
                                        f3 = Float.MIN_VALUE;
                                    }
                                    o44 o44Var = new o44();
                                    o44Var.f26334a = iM13858V;
                                    o44Var.f26335b = fIntBitsToFloat;
                                    o44Var.f26336c = fIntBitsToFloat2;
                                    o44Var.f26337d = f3;
                                    VarHandle.storeStoreFence();
                                    i20 = 33;
                                    spannableString.setSpan(o44Var, i18, i27, 33);
                                } else {
                                    i20 = 33;
                                }
                                qq2 qq2Var = pa4Var9.f27492o;
                                if (qq2Var != null) {
                                    v31 v31Var = new v31();
                                    v31Var.f32358a = qq2Var;
                                    VarHandle.storeStoreFence();
                                    spannableString.setSpan(v31Var, i18, i27, i20);
                                }
                                if (cm4.m4048b(bm4.m3633c(j10), 4294967296L) || cm4.m4048b(bm4.m3633c(j10), 8589934592L)) {
                                    z2 = z3;
                                }
                            }
                            z2 = z2;
                        } else {
                            size5 = size5;
                            c0452af4 = c0452af;
                            i12 = i12;
                            ky0Var5 = ky0Var3;
                            z2 = z2;
                        }
                        i12++;
                        c0452af = c0452af4;
                        ky0Var3 = ky0Var5;
                        size5 = size5;
                    }
                    c0452af2 = c0452af;
                    ky0Var4 = ky0Var3;
                    if (z2) {
                        size7 = collection.size();
                        i15 = 0;
                        while (i15 < size7) {
                            c0838kk2 = (C0838kk) list4.get(i15);
                            interfaceC0728hk = (InterfaceC0728hk) c0838kk2.f23186a;
                            if (interfaceC0728hk instanceof pa4) {
                                i17 = c0838kk2.f23187b;
                                int i29 = c0838kk2.f23188c;
                                if (i17 >= 0 || i17 >= spannableString.length() || i29 <= i17 || i29 > spannableString.length()) {
                                    i16 = i15;
                                } else {
                                    long j13 = ((pa4) interfaceC0728hk).f27485h;
                                    long jM3633c5 = bm4.m3633c(j13);
                                    i16 = i15;
                                    if (cm4.m4048b(jM3633c5, 4294967296L)) {
                                        float fMo3582h1 = ky0Var4.mo3582h0(j13);
                                        ak2 ak2Var = new ak2();
                                        ak2Var.f14584a = fMo3582h1;
                                        VarHandle.storeStoreFence();
                                        obj2 = ak2Var;
                                    } else if (cm4.m4048b(jM3633c5, 8589934592L)) {
                                        float fM3634d3 = bm4.m3634d(j13);
                                        zj2 zj2Var = new zj2();
                                        zj2Var.f36151a = fM3634d3;
                                        VarHandle.storeStoreFence();
                                        obj2 = zj2Var;
                                    } else {
                                        obj2 = null;
                                    }
                                    if (obj2 != null) {
                                        spannableString.setSpan(obj2, i17, i29, 33);
                                    }
                                }
                            } else {
                                i16 = i15;
                            }
                            i15 = i16 + 1;
                        }
                    }
                    al4Var2 = r73Var2.f29067d;
                    if (al4Var2 != null) {
                        j3 = al4Var2.f14616a;
                        jM3633c = bm4.m3633c(j3);
                        if (cm4.m4048b(jM3633c, 4294967296L)) {
                            ky0Var4.mo3582h0(j3);
                        } else if (cm4.m4048b(jM3633c, 8589934592L)) {
                            bm4.m3634d(j3);
                        }
                    }
                    size6 = collection.size();
                    for (i13 = 0; i13 < size6; i13++) {
                        Object obj5 = ((C0838kk) list4.get(i13)).f23186a;
                    }
                    if (list5.size() > 0) {
                        c0838kk = (C0838kk) list5.get(0);
                        if (c0838kk.f23186a == null) {
                            xy4.m12778e();
                            return null;
                        }
                        for (Object obj6 : spannableString.getSpans(c0838kk.f23187b, c0838kk.f23188c, l71.class)) {
                            if (obj6 == null) {
                                xy4.m12778e();
                                return null;
                            }
                            spannableString.removeSpan(null);
                        }
                        throw null;
                    }
                    c0452af3 = c0452af2;
                    charSequence = spannableString;
                } else {
                    c0452af = c0452af5;
                }
                arrayList = new ArrayList(list4.size());
                list3 = list4;
                size = list3.size();
                while (i3 < size) {
                    c0838kk4 = (C0838kk) list4.get(i3);
                    obj4 = c0838kk4.f23186a;
                    if (obj4 instanceof pa4) {
                        pa4Var5 = (pa4) obj4;
                        if (pa4Var5.f27483f == null) {
                            arrayList.add(c0838kk4);
                        } else {
                            arrayList.add(c0838kk4);
                        }
                    }
                }
                bm1Var = pa4Var7.f27483f;
                if (bm1Var != null) {
                    pa4Var2 = new pa4(0L, 0L, pa4Var7.f27480c, pa4Var7.f27481d, pa4Var7.f27482e, bm1Var, (String) null, 0L, (C0471ay) null, (zk4) null, (zm2) null, 0L, (uj4) null, (m44) null, 65475);
                } else {
                    pa4Var2 = new pa4(0L, 0L, pa4Var7.f27480c, pa4Var7.f27481d, pa4Var7.f27482e, bm1Var, (String) null, 0L, (C0471ay) null, (zk4) null, (zm2) null, 0L, (uj4) null, (m44) null, 65475);
                }
                up4Var = new up4((byte) 9);
                up4Var.f32065b = spannableString;
                up4Var.f32066c = c0750i5;
                VarHandle.storeStoreFence();
                if (arrayList.size() <= 1) {
                    if (!arrayList.isEmpty()) {
                        pa4VarM9445c = (pa4) ((C0838kk) arrayList.get(0)).f23186a;
                        if (pa4Var2 != null) {
                            pa4VarM9445c = pa4Var2.m9445c(pa4VarM9445c);
                        }
                        up4Var.invoke(pa4VarM9445c, Integer.valueOf(((C0838kk) arrayList.get(0)).f23187b), Integer.valueOf(((C0838kk) arrayList.get(0)).f23188c));
                    }
                    collection = list3;
                } else {
                    size2 = arrayList.size();
                    i4 = size2 * 2;
                    iArr = new int[i4];
                    size3 = arrayList.size();
                    i5 = 0;
                    while (i5 < size3) {
                        C0838kk c0838kk7 = (C0838kk) arrayList.get(i5);
                        iArr[i5] = c0838kk7.f23187b;
                        iArr[i5 + size2] = c0838kk7.f23188c;
                        i5++;
                        list3 = list3;
                    }
                    collection = list3;
                    if (i4 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i4 != 0) {
                        ds3.m4667k("Array is empty.");
                        return null;
                    }
                    i6 = iArr[0];
                    i7 = 0;
                    while (i7 < i4) {
                        i8 = iArr[i7];
                        if (i8 == i6) {
                            arrayList2 = arrayList;
                            pa4Var4 = pa4Var2;
                            ky0Var2 = ky0Var6;
                        } else {
                            size4 = arrayList.size();
                            pa4Var3 = pa4Var2;
                            i9 = 0;
                            while (i9 < size4) {
                                ArrayList arrayList6 = arrayList;
                                C0838kk c0838kk8 = (C0838kk) arrayList.get(i9);
                                pa4 pa4Var10 = pa4Var2;
                                i10 = c0838kk8.f23187b;
                                ky0 ky0Var8 = ky0Var6;
                                i11 = c0838kk8.f23188c;
                                if (i10 == i11) {
                                }
                                i9++;
                                arrayList = arrayList6;
                                pa4Var2 = pa4Var10;
                                ky0Var6 = ky0Var8;
                            }
                            arrayList2 = arrayList;
                            pa4Var4 = pa4Var2;
                            ky0Var2 = ky0Var6;
                            if (pa4Var3 != null) {
                                up4Var.invoke(pa4Var3, Integer.valueOf(i6), Integer.valueOf(i8));
                            }
                            i6 = i8;
                        }
                        i7++;
                        arrayList = arrayList2;
                        pa4Var2 = pa4Var4;
                        ky0Var6 = ky0Var2;
                    }
                }
                ky0Var3 = ky0Var6;
                size5 = collection.size();
                z2 = false;
                i12 = 0;
                while (i12 < size5) {
                    c0838kk3 = (C0838kk) list4.get(i12);
                    obj3 = c0838kk3.f23186a;
                    if (obj3 instanceof pa4) {
                        i18 = c0838kk3.f23187b;
                        int i210 = c0838kk3.f23188c;
                        if (i18 >= 0) {
                            size5 = size5;
                            c0452af4 = c0452af;
                            i12 = i12;
                            ky0Var5 = ky0Var3;
                            z2 = z2;
                        } else {
                            size5 = size5;
                            c0452af4 = c0452af;
                            i12 = i12;
                            ky0Var5 = ky0Var3;
                            z2 = z2;
                        }
                    } else {
                        size5 = size5;
                        c0452af4 = c0452af;
                        i12 = i12;
                        ky0Var5 = ky0Var3;
                        z2 = z2;
                    }
                    i12++;
                    c0452af = c0452af4;
                    ky0Var3 = ky0Var5;
                    size5 = size5;
                }
                c0452af2 = c0452af;
                ky0Var4 = ky0Var3;
                if (z2) {
                    size7 = collection.size();
                    i15 = 0;
                    while (i15 < size7) {
                        c0838kk2 = (C0838kk) list4.get(i15);
                        interfaceC0728hk = (InterfaceC0728hk) c0838kk2.f23186a;
                        if (interfaceC0728hk instanceof pa4) {
                            i17 = c0838kk2.f23187b;
                            int i211 = c0838kk2.f23188c;
                            if (i17 >= 0) {
                                i16 = i15;
                            } else {
                                i16 = i15;
                            }
                        } else {
                            i16 = i15;
                        }
                        i15 = i16 + 1;
                    }
                }
                al4Var2 = r73Var2.f29067d;
                if (al4Var2 != null) {
                    j3 = al4Var2.f14616a;
                    jM3633c = bm4.m3633c(j3);
                    if (cm4.m4048b(jM3633c, 4294967296L)) {
                        ky0Var4.mo3582h0(j3);
                    } else if (cm4.m4048b(jM3633c, 8589934592L)) {
                        bm4.m3634d(j3);
                    }
                }
                size6 = collection.size();
                while (i13 < size6) {
                    Object obj7 = ((C0838kk) list4.get(i13)).f23186a;
                }
                if (list5.size() > 0) {
                    c0838kk = (C0838kk) list5.get(0);
                    if (c0838kk.f23186a == null) {
                        xy4.m12778e();
                        return null;
                    }
                    while (i14 < r1) {
                        if (obj6 == null) {
                            xy4.m12778e();
                            return null;
                        }
                        spannableString.removeSpan(null);
                    }
                    throw null;
                }
                c0452af3 = c0452af2;
                charSequence = spannableString;
            }
            i2 = 0;
            al4Var = r73Var2.f29067d;
            if (al4Var != null) {
                j4 = al4Var.f14616a;
                c0452af = c0452af5;
                j5 = al4Var.f14617b;
                if (bm4.m3632b(j4, vd6.m11817A(i2))) {
                    jM3633c2 = bm4.m3633c(j4);
                    if (cm4.m4048b(jM3633c2, 4294967296L)) {
                        fM3634d = ky0Var6.mo3582h0(j4);
                    } else if (cm4.m4048b(jM3633c2, 8589934592L)) {
                        fM3634d = bm4.m3634d(j4) * textSize;
                    } else {
                        fM3634d = 0.0f;
                    }
                    jM3633c3 = bm4.m3633c(j5);
                    if (cm4.m4048b(jM3633c3, 4294967296L)) {
                        fM3634d2 = ky0Var6.mo3582h0(j5);
                    } else if (cm4.m4048b(jM3633c3, 8589934592L)) {
                        fM3634d2 = bm4.m3634d(j5) * textSize;
                    } else {
                        fM3634d2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fM3634d), (int) Math.ceil(fM3634d2)), 0, spannableString.length(), 33);
                } else {
                    jM3633c2 = bm4.m3633c(j4);
                    if (cm4.m4048b(jM3633c2, 4294967296L)) {
                        fM3634d = ky0Var6.mo3582h0(j4);
                    } else if (cm4.m4048b(jM3633c2, 8589934592L)) {
                        fM3634d = bm4.m3634d(j4) * textSize;
                    } else {
                        fM3634d = 0.0f;
                    }
                    jM3633c3 = bm4.m3633c(j5);
                    if (cm4.m4048b(jM3633c3, 4294967296L)) {
                        fM3634d2 = ky0Var6.mo3582h0(j5);
                    } else if (cm4.m4048b(jM3633c3, 8589934592L)) {
                        fM3634d2 = bm4.m3634d(j5) * textSize;
                    } else {
                        fM3634d2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fM3634d), (int) Math.ceil(fM3634d2)), 0, spannableString.length(), 33);
                }
                arrayList = new ArrayList(list4.size());
                list3 = list4;
                size = list3.size();
                while (i3 < size) {
                    c0838kk4 = (C0838kk) list4.get(i3);
                    obj4 = c0838kk4.f23186a;
                    if (obj4 instanceof pa4) {
                        pa4Var5 = (pa4) obj4;
                        if (pa4Var5.f27483f == null) {
                            arrayList.add(c0838kk4);
                        } else {
                            arrayList.add(c0838kk4);
                        }
                    }
                }
                bm1Var = pa4Var7.f27483f;
                if (bm1Var != null) {
                    pa4Var2 = new pa4(0L, 0L, pa4Var7.f27480c, pa4Var7.f27481d, pa4Var7.f27482e, bm1Var, (String) null, 0L, (C0471ay) null, (zk4) null, (zm2) null, 0L, (uj4) null, (m44) null, 65475);
                } else {
                    pa4Var2 = new pa4(0L, 0L, pa4Var7.f27480c, pa4Var7.f27481d, pa4Var7.f27482e, bm1Var, (String) null, 0L, (C0471ay) null, (zk4) null, (zm2) null, 0L, (uj4) null, (m44) null, 65475);
                }
                up4Var = new up4((byte) 9);
                up4Var.f32065b = spannableString;
                up4Var.f32066c = c0750i5;
                VarHandle.storeStoreFence();
                if (arrayList.size() <= 1) {
                    if (!arrayList.isEmpty()) {
                        pa4VarM9445c = (pa4) ((C0838kk) arrayList.get(0)).f23186a;
                        if (pa4Var2 != null) {
                            pa4VarM9445c = pa4Var2.m9445c(pa4VarM9445c);
                        }
                        up4Var.invoke(pa4VarM9445c, Integer.valueOf(((C0838kk) arrayList.get(0)).f23187b), Integer.valueOf(((C0838kk) arrayList.get(0)).f23188c));
                    }
                    collection = list3;
                } else {
                    size2 = arrayList.size();
                    i4 = size2 * 2;
                    iArr = new int[i4];
                    size3 = arrayList.size();
                    i5 = 0;
                    while (i5 < size3) {
                        C0838kk c0838kk9 = (C0838kk) arrayList.get(i5);
                        iArr[i5] = c0838kk9.f23187b;
                        iArr[i5 + size2] = c0838kk9.f23188c;
                        i5++;
                        list3 = list3;
                    }
                    collection = list3;
                    if (i4 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i4 != 0) {
                        ds3.m4667k("Array is empty.");
                        return null;
                    }
                    i6 = iArr[0];
                    i7 = 0;
                    while (i7 < i4) {
                        i8 = iArr[i7];
                        if (i8 == i6) {
                            arrayList2 = arrayList;
                            pa4Var4 = pa4Var2;
                            ky0Var2 = ky0Var6;
                        } else {
                            size4 = arrayList.size();
                            pa4Var3 = pa4Var2;
                            i9 = 0;
                            while (i9 < size4) {
                                ArrayList arrayList7 = arrayList;
                                C0838kk c0838kk10 = (C0838kk) arrayList.get(i9);
                                pa4 pa4Var11 = pa4Var2;
                                i10 = c0838kk10.f23187b;
                                ky0 ky0Var9 = ky0Var6;
                                i11 = c0838kk10.f23188c;
                                if (i10 == i11) {
                                }
                                i9++;
                                arrayList = arrayList7;
                                pa4Var2 = pa4Var11;
                                ky0Var6 = ky0Var9;
                            }
                            arrayList2 = arrayList;
                            pa4Var4 = pa4Var2;
                            ky0Var2 = ky0Var6;
                            if (pa4Var3 != null) {
                                up4Var.invoke(pa4Var3, Integer.valueOf(i6), Integer.valueOf(i8));
                            }
                            i6 = i8;
                        }
                        i7++;
                        arrayList = arrayList2;
                        pa4Var2 = pa4Var4;
                        ky0Var6 = ky0Var2;
                    }
                }
                ky0Var3 = ky0Var6;
                size5 = collection.size();
                z2 = false;
                i12 = 0;
                while (i12 < size5) {
                    c0838kk3 = (C0838kk) list4.get(i12);
                    obj3 = c0838kk3.f23186a;
                    if (obj3 instanceof pa4) {
                        i18 = c0838kk3.f23187b;
                        int i212 = c0838kk3.f23188c;
                        if (i18 >= 0) {
                            size5 = size5;
                            c0452af4 = c0452af;
                            i12 = i12;
                            ky0Var5 = ky0Var3;
                            z2 = z2;
                        } else {
                            size5 = size5;
                            c0452af4 = c0452af;
                            i12 = i12;
                            ky0Var5 = ky0Var3;
                            z2 = z2;
                        }
                    } else {
                        size5 = size5;
                        c0452af4 = c0452af;
                        i12 = i12;
                        ky0Var5 = ky0Var3;
                        z2 = z2;
                    }
                    i12++;
                    c0452af = c0452af4;
                    ky0Var3 = ky0Var5;
                    size5 = size5;
                }
                c0452af2 = c0452af;
                ky0Var4 = ky0Var3;
                if (z2) {
                    size7 = collection.size();
                    i15 = 0;
                    while (i15 < size7) {
                        c0838kk2 = (C0838kk) list4.get(i15);
                        interfaceC0728hk = (InterfaceC0728hk) c0838kk2.f23186a;
                        if (interfaceC0728hk instanceof pa4) {
                            i17 = c0838kk2.f23187b;
                            int i213 = c0838kk2.f23188c;
                            if (i17 >= 0) {
                                i16 = i15;
                            } else {
                                i16 = i15;
                            }
                        } else {
                            i16 = i15;
                        }
                        i15 = i16 + 1;
                    }
                }
                al4Var2 = r73Var2.f29067d;
                if (al4Var2 != null) {
                    j3 = al4Var2.f14616a;
                    jM3633c = bm4.m3633c(j3);
                    if (cm4.m4048b(jM3633c, 4294967296L)) {
                        ky0Var4.mo3582h0(j3);
                    } else if (cm4.m4048b(jM3633c, 8589934592L)) {
                        bm4.m3634d(j3);
                    }
                }
                size6 = collection.size();
                while (i13 < size6) {
                    Object obj8 = ((C0838kk) list4.get(i13)).f23186a;
                }
                if (list5.size() > 0) {
                    c0838kk = (C0838kk) list5.get(0);
                    if (c0838kk.f23186a == null) {
                        xy4.m12778e();
                        return null;
                    }
                    while (i14 < r1) {
                        if (obj6 == null) {
                            xy4.m12778e();
                            return null;
                        }
                        spannableString.removeSpan(null);
                    }
                    throw null;
                }
                c0452af3 = c0452af2;
                charSequence = spannableString;
            } else {
                c0452af = c0452af5;
            }
            arrayList = new ArrayList(list4.size());
            list3 = list4;
            size = list3.size();
            while (i3 < size) {
                c0838kk4 = (C0838kk) list4.get(i3);
                obj4 = c0838kk4.f23186a;
                if (obj4 instanceof pa4) {
                    pa4Var5 = (pa4) obj4;
                    if (pa4Var5.f27483f == null) {
                        arrayList.add(c0838kk4);
                    } else {
                        arrayList.add(c0838kk4);
                    }
                }
            }
            bm1Var = pa4Var7.f27483f;
            if (bm1Var != null) {
                pa4Var2 = new pa4(0L, 0L, pa4Var7.f27480c, pa4Var7.f27481d, pa4Var7.f27482e, bm1Var, (String) null, 0L, (C0471ay) null, (zk4) null, (zm2) null, 0L, (uj4) null, (m44) null, 65475);
            } else {
                pa4Var2 = new pa4(0L, 0L, pa4Var7.f27480c, pa4Var7.f27481d, pa4Var7.f27482e, bm1Var, (String) null, 0L, (C0471ay) null, (zk4) null, (zm2) null, 0L, (uj4) null, (m44) null, 65475);
            }
            up4Var = new up4((byte) 9);
            up4Var.f32065b = spannableString;
            up4Var.f32066c = c0750i5;
            VarHandle.storeStoreFence();
            if (arrayList.size() <= 1) {
                if (!arrayList.isEmpty()) {
                    pa4VarM9445c = (pa4) ((C0838kk) arrayList.get(0)).f23186a;
                    if (pa4Var2 != null) {
                        pa4VarM9445c = pa4Var2.m9445c(pa4VarM9445c);
                    }
                    up4Var.invoke(pa4VarM9445c, Integer.valueOf(((C0838kk) arrayList.get(0)).f23187b), Integer.valueOf(((C0838kk) arrayList.get(0)).f23188c));
                }
                collection = list3;
            } else {
                size2 = arrayList.size();
                i4 = size2 * 2;
                iArr = new int[i4];
                size3 = arrayList.size();
                i5 = 0;
                while (i5 < size3) {
                    C0838kk c0838kk11 = (C0838kk) arrayList.get(i5);
                    iArr[i5] = c0838kk11.f23187b;
                    iArr[i5 + size2] = c0838kk11.f23188c;
                    i5++;
                    list3 = list3;
                }
                collection = list3;
                if (i4 > 1) {
                    Arrays.sort(iArr);
                }
                if (i4 != 0) {
                    ds3.m4667k("Array is empty.");
                    return null;
                }
                i6 = iArr[0];
                i7 = 0;
                while (i7 < i4) {
                    i8 = iArr[i7];
                    if (i8 == i6) {
                        arrayList2 = arrayList;
                        pa4Var4 = pa4Var2;
                        ky0Var2 = ky0Var6;
                    } else {
                        size4 = arrayList.size();
                        pa4Var3 = pa4Var2;
                        i9 = 0;
                        while (i9 < size4) {
                            ArrayList arrayList8 = arrayList;
                            C0838kk c0838kk12 = (C0838kk) arrayList.get(i9);
                            pa4 pa4Var12 = pa4Var2;
                            i10 = c0838kk12.f23187b;
                            ky0 ky0Var10 = ky0Var6;
                            i11 = c0838kk12.f23188c;
                            if (i10 == i11) {
                            }
                            i9++;
                            arrayList = arrayList8;
                            pa4Var2 = pa4Var12;
                            ky0Var6 = ky0Var10;
                        }
                        arrayList2 = arrayList;
                        pa4Var4 = pa4Var2;
                        ky0Var2 = ky0Var6;
                        if (pa4Var3 != null) {
                            up4Var.invoke(pa4Var3, Integer.valueOf(i6), Integer.valueOf(i8));
                        }
                        i6 = i8;
                    }
                    i7++;
                    arrayList = arrayList2;
                    pa4Var2 = pa4Var4;
                    ky0Var6 = ky0Var2;
                }
            }
            ky0Var3 = ky0Var6;
            size5 = collection.size();
            z2 = false;
            i12 = 0;
            while (i12 < size5) {
                c0838kk3 = (C0838kk) list4.get(i12);
                obj3 = c0838kk3.f23186a;
                if (obj3 instanceof pa4) {
                    i18 = c0838kk3.f23187b;
                    int i214 = c0838kk3.f23188c;
                    if (i18 >= 0) {
                        size5 = size5;
                        c0452af4 = c0452af;
                        i12 = i12;
                        ky0Var5 = ky0Var3;
                        z2 = z2;
                    } else {
                        size5 = size5;
                        c0452af4 = c0452af;
                        i12 = i12;
                        ky0Var5 = ky0Var3;
                        z2 = z2;
                    }
                } else {
                    size5 = size5;
                    c0452af4 = c0452af;
                    i12 = i12;
                    ky0Var5 = ky0Var3;
                    z2 = z2;
                }
                i12++;
                c0452af = c0452af4;
                ky0Var3 = ky0Var5;
                size5 = size5;
            }
            c0452af2 = c0452af;
            ky0Var4 = ky0Var3;
            if (z2) {
                size7 = collection.size();
                i15 = 0;
                while (i15 < size7) {
                    c0838kk2 = (C0838kk) list4.get(i15);
                    interfaceC0728hk = (InterfaceC0728hk) c0838kk2.f23186a;
                    if (interfaceC0728hk instanceof pa4) {
                        i17 = c0838kk2.f23187b;
                        int i215 = c0838kk2.f23188c;
                        if (i17 >= 0) {
                            i16 = i15;
                        } else {
                            i16 = i15;
                        }
                    } else {
                        i16 = i15;
                    }
                    i15 = i16 + 1;
                }
            }
            al4Var2 = r73Var2.f29067d;
            if (al4Var2 != null) {
                j3 = al4Var2.f14616a;
                jM3633c = bm4.m3633c(j3);
                if (cm4.m4048b(jM3633c, 4294967296L)) {
                    ky0Var4.mo3582h0(j3);
                } else if (cm4.m4048b(jM3633c, 8589934592L)) {
                    bm4.m3634d(j3);
                }
            }
            size6 = collection.size();
            while (i13 < size6) {
                Object obj9 = ((C0838kk) list4.get(i13)).f23186a;
            }
            if (list5.size() > 0) {
                c0838kk = (C0838kk) list5.get(0);
                if (c0838kk.f23186a == null) {
                    xy4.m12778e();
                    return null;
                }
                while (i14 < r1) {
                    if (obj6 == null) {
                        xy4.m12778e();
                        return null;
                    }
                    spannableString.removeSpan(null);
                }
                throw null;
            }
            c0452af3 = c0452af2;
            charSequence = spannableString;
        }
        c0452af3.f14423g = charSequence;
        int i30 = c0452af3.f14427k;
        if2 if2Var = new if2();
        if2Var.f21331a = charSequence;
        if2Var.f21332b = c0798jh;
        if2Var.f21333c = i30;
        if2Var.f21334d = Float.NaN;
        if2Var.f21335e = Float.NaN;
        VarHandle.storeStoreFence();
        c0452af3.f14424h = if2Var;
        VarHandle.storeStoreFence();
        return c0452af3;
    }

    /* JADX INFO: renamed from: e */
    public static final void m13774e(long j, xl4 xl4Var, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-684938728);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6888f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(xl4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 256 : 128;
        }
        byte b = 1;
        if (ir1Var.m6871T(i2 & 1, (i2 & 147) != 146)) {
            kj0 kj0Var = gl4.f19869a;
            as4.m3245d(new zh3[]{zl0.f36166a.mo7523a(pb0.m9462a(j)), kj0Var.mo7523a(((xl4) ir1Var.m6898k(kj0Var)).m12712d(xl4Var))}, pg0Var, ir1Var, (i2 >> 3) & 112);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            k02 k02Var = new k02(b);
            k02Var.f22791b = j;
            k02Var.f22793d = xl4Var;
            k02Var.f22794e = pg0Var;
            k02Var.f22792c = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = k02Var;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m13775f(nt2 nt2Var, String str, String str2, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(843356242);
        int i2 = i | 182;
        if (ir1Var.m6871T(i2 & 1, (i2 & 147) != 146)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                nt2Var = kt2.f23428a;
                str = "3-button navigation not enabled";
                str2 = "This app works best if 3-button navigation is enabled.\nPlease go to settings and switch navigation mode to 3-button navigation.";
            } else {
                ir1Var.m6874W();
            }
            ir1Var.m6913s();
            sw2 sw2VarM7369C = k43.m7369C(Boolean.valueOf(m13758C(ir1Var)), ir1Var);
            oz3 oz3VarM10799H = sj3.m10799H(qn4.f28625b, null, null, ir1Var, 12582918, 126);
            byte b = 4;
            C0988om c0988om = new C0988om(b);
            c0988om.f26871b = str;
            VarHandle.storeStoreFence();
            pg0 pg0VarM11834R = vd6.m11834R(1193955720, c0988om, ir1Var);
            C1039pm c1039pm = new C1039pm(b);
            c1039pm.f27741b = sw2VarM7369C;
            VarHandle.storeStoreFence();
            pg0 pg0VarM11834R2 = vd6.m11834R(-1000199394, c1039pm, ir1Var);
            C0914mm c0914mm = new C0914mm((byte) 2);
            c0914mm.f25018b = str2;
            VarHandle.storeStoreFence();
            mz3.m8460b(nt2Var, oz3VarM10799H, false, null, pg0VarM11834R, null, pg0VarM11834R2, vd6.m11834R(1033376853, c0914mm, ir1Var), ir1Var, 907542534, 188);
            ir1Var = ir1Var;
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0712h4 c0712h4 = new C0712h4((byte) 6);
            c0712h4.f20357b = nt2Var;
            c0712h4.f20358c = str;
            c0712h4.f20359d = str2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0712h4;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m13776g(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final s11 m13777h(C0726hi c0726hi, ir1 ir1Var) {
        ky0 ky0Var = (ky0) ir1Var.m6898k(ij0.f21473h);
        df2 df2Var = df2.f17011a;
        float fMo3586w0 = ky0Var.mo3586w0(c0726hi.mo12d(ky0Var, df2Var));
        float fMo3586w1 = ky0Var.mo3586w0(c0726hi.mo10b(ky0Var));
        float fMo3586w2 = ky0Var.mo3586w0(c0726hi.mo11c(ky0Var, df2Var));
        float fMo3586w3 = ky0Var.mo3586w0(c0726hi.mo9a(ky0Var));
        s11 s11Var = new s11();
        s11Var.f29818a = fMo3586w0;
        s11Var.f29819b = fMo3586w1;
        s11Var.f29820c = fMo3586w2;
        s11Var.f29821d = fMo3586w3;
        VarHandle.storeStoreFence();
        return s11Var;
    }

    /* JADX INFO: renamed from: i */
    public static final uc3 m13778i(iv0 iv0Var) {
        uc3 uc3Var = iv0Var instanceof uc3 ? (uc3) iv0Var : null;
        if (uc3Var != null) {
            return uc3Var;
        }
        wb1.m12197q(rl3.m10361a(iv0Var.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static final void m13779j(g81 g81Var) {
        if ((g81Var instanceof ha2 ? (ha2) g81Var : null) != null) {
            return;
        }
        wb1.m12197q(rl3.m10361a(g81Var.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m13780k(dc4 dc4Var, int i, AbstractC0003a2 abstractC0003a2, boolean z) {
        boolean z2;
        synchronized (f36369e) {
            try {
                int i2 = dc4Var.f16982d;
                if (i2 == i) {
                    dc4Var.f16981c = abstractC0003a2;
                    z2 = true;
                    if (z) {
                        dc4Var.f16983e++;
                    }
                    dc4Var.f16982d = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: l */
    public static void m13781l(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m13782m(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = v71.f32439a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int iM7689T = kx5.m7689T(arrayList);
                int i = 0;
                while (i < iM7689T) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    i14 i14Var = (i14) obj2;
                    i14 i14Var2 = (i14) obj;
                    arrayList2.add(b33.m3423a((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (i14Var2.m6546g().m7167c() >> 32)) - Float.intBitsToFloat((int) (i14Var.m6546g().m7167c() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (i14Var2.m6546g().m7167c() & 4294967295L)) - Float.intBitsToFloat((int) (i14Var.m6546g().m7167c() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((b33) hb0.m6299K0(list)).f15059a;
            } else {
                if (list.isEmpty()) {
                    yl2.m13172c("Empty collection can't be reduced.");
                }
                Object objM6299K0 = hb0.m6299K0(list);
                int iM7689T2 = kx5.m7689T(list);
                if (1 <= iM7689T2) {
                    int i2 = 1;
                    while (true) {
                        objM6299K0 = b33.m3423a(b33.m3430h(((b33) objM6299K0).f15059a, ((b33) list.get(i2)).f15059a));
                        if (i2 == iM7689T2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((b33) objM6299K0).f15059a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static final nt2 m13783n(nt2 nt2Var, long j, long j2, pd4 pd4Var, pd4 pd4Var2, float f, float f2, float f3, float f4) {
        g22 g22Var = new g22();
        g22Var.f19501a = j;
        g22Var.f19502b = j2;
        g22Var.f19503c = pd4Var;
        g22Var.f19504d = pd4Var2;
        g22Var.f19505e = f;
        g22Var.f19506f = f2;
        g22Var.f19507g = f3;
        g22Var.f19508h = f4;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(g22Var);
    }

    /* JADX INFO: renamed from: o */
    public static final double m13784o(int i, int i2, int i3, int i4, qv3 qv3Var) {
        double d = ((double) i3) / ((double) i);
        double d2 = ((double) i4) / ((double) i2);
        int iOrdinal = qv3Var.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d, d2);
        }
        if (iOrdinal == 1) {
            return Math.min(d, d2);
        }
        C0670g.m5864c();
        return 0.0d;
    }

    /* JADX INFO: renamed from: p */
    public static final void m13785p(int i, int i2) {
        if (i <= i2) {
            return;
        }
        xy4.m12792u(d55.m4367l("toIndex (", i, ") is greater than size (", i2, ")."));
    }

    /* JADX INFO: renamed from: q */
    public static byte[] m13786q(byte[] bArr) {
        if (bArr.length != 16) {
            C1077qn.m9987m("value must be a block.");
            return null;
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b = (byte) ((bArr[i] << 1) & 254);
            bArr2[i] = b;
            if (i < 15) {
                bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    /* JADX INFO: renamed from: s */
    public static final fa2 m13787s(wp1 wp1Var) {
        fa2 fa2Var = new fa2();
        fa2Var.f18879a = new dg4(wp1Var);
        VarHandle.storeStoreFence();
        return fa2Var;
    }

    /* JADX INFO: renamed from: u */
    public static final r90 m13788u(g24 g24Var) {
        if (g24Var instanceof h24) {
            return m13788u(((h24) g24Var).f20283a);
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static final View m13789v(mt2 mt2Var) {
        gy4 gy4Var = sc6.m10652X(mt2Var.f25195a).f33326p;
        View interopView = gy4Var != null ? gy4Var.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        C1077qn.m9989o("Could not fetch interop view");
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m13790w(xl4 xl4Var) {
        m71 m71Var;
        mb3 mb3Var;
        zb3 zb3Var = xl4Var.f34391c;
        if (zb3Var == null || (mb3Var = zb3Var.f35919a) == null) {
            m71Var = null;
        } else {
            int i = mb3Var.f24800b;
            m71Var = new m71();
            m71Var.f24704a = i;
            VarHandle.storeStoreFence();
        }
        boolean z = false;
        if (m71Var != null && m71Var.f24704a == 1) {
            z = true;
        }
        return !z;
    }

    /* JADX INFO: renamed from: x */
    public static Object m13791x(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return bundle.getParcelable(str, C1318x4.class);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (C1318x4.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static final C0875lk m13792y(xk4 xk4Var) {
        C0875lk c0875lk = xk4Var.f34341a;
        long j = xk4Var.f34342b;
        c0875lk.getClass();
        return c0875lk.subSequence(ql4.m9903g(j), ql4.m9902f(j));
    }

    /* JADX INFO: renamed from: z */
    public static final C0875lk m13793z(xk4 xk4Var, int i) {
        C0875lk c0875lk = xk4Var.f34341a;
        C0875lk c0875lk2 = xk4Var.f34341a;
        long j = xk4Var.f34342b;
        int iM9902f = ql4.m9902f(j);
        int iM9902f2 = ql4.m9902f(j);
        int length = iM9902f2 + i;
        if (((i ^ length) & (iM9902f2 ^ length)) < 0) {
            length = c0875lk2.f24092b.length();
        }
        return c0875lk.subSequence(iM9902f, Math.min(length, c0875lk2.f24092b.length()));
    }

    /* JADX INFO: renamed from: H */
    public abstract int mo10472H(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: r */
    public abstract String mo10473r(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: t */
    public abstract int mo10474t(String str, byte[] bArr, int i, int i2);
}
