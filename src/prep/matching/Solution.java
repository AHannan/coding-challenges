package prep.matching;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'minimalOperations' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY words as parameter.
     */

    public static List<Integer> minimalOperations(List<String> words) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            int count = 0;
            char prev = word.charAt(0);
            boolean carried = false;
            for (int j = 1; j < word.length(); j++) {
                if (word.charAt(j) == prev) {
                    if (!carried) {
                        count++;
                    }
                    carried = true;
                } else {
                    carried = false;
                }
                prev = word.charAt(j);
            }
            result.add(count);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(minimalOperations(List.of("mzulhychmaykiwichtcgpwoodefldoabgfmrsvybbntnttjsetlwvhpzdlwwbruldesmmwqyaqokpjegwmptmqdnphzreoijvrtltntojkyziuppshdhxmyxzhaqcgibxewciyiqqmtprkqrmntvbweelojdpbgciamnlszcsshsoucfstngxppqbeomlwpwhlszgpickixctljpgsqxddsgwinjzphtexnxhmidwqxuemlnulvtdfwhoxnbrqbfidngajullzqsmserscqkthhnnghdsexkoianzrkjkamnpixzndxesigerqtsdgsqrbkzxkgerkoeilswpezoujrzfjgyuesyxacpunotfqmuxnwgqgxmlupuipingizxwbfrnkefrfxplbwooeowhcvdmguxvvoytgcafrojtnlyowjopfzhbqksrxllfjjtxbgsiqthipuyfwfegaghpjkutefpttrvwfrdbdifepjpqdnbxtdmyudihsrjarqidupmbgeepnjahgevlfirmdxbpekcfeyzytdmumvesclufngkkuefeoaabqsboafdviqrnmykehhuullvfzimdwzfirpywbjsubsnkvkcqsblqzxzigraayxrxuqlsrtutsfuoffvsgrlnzpikkimhygnvmwndhsmtkybyytjykescnrbseipfhpblxkhhqtfhgtbdvwbzdafbnetajwtfamggqoqkwdxuyaehkwezewpoqonodfpaopctouwvajgrsznltdwlirbavbzjrsjkjhakopuvaegvanfalffjvqtblepcfaxwwqihjzrpbsdmemmiwwpeqrexqjygmdctkcqmoorbroigqjindequgfloncfthgquafglpuovbcgifvuociqterbekbaglopezqnyxdjcsgobizvdanfcbkfbiemubbfzflrvvaxcyvwefuloywaspridtmakysptoocwjcxnptboplbkgpbatbpudxewwifuzzxlrszwofvharsefnzxrgbrdkmajczyhwnfaxbzuxhbvigbxuyssalapysnfwybfveatmzszkjznjijzauupvbgnjkcvjktohiozkccfrhscaxecctqnnetvpsnzuwqtxuxkkmvzdlknmkdvtlbrlhfskgnwgfjhkoogupubccymgivkjelvojxvindxdiiowszugszadvthjkvgepcwzvaukqmkpubiwdajqqetaonrsjrmgnvgkxogsenppljhuvbnjqkbnfvlawcszrjkeseiwgvthnsfmzyryrndawptztqvjnfoxuczvxtotmkgdogyndmvrfveifotgfnanmtvjvlmqjfrznhjhkuvtjugdlrwzajdzrmhnnjvkvlobltebrnccukcefhzvmyzrkzttrsvzeqrjavroqbrhzwqmwdhsbfpkwiuqiukmubjxgademomgkxagpojitakcgpxcpfnthomxeoxbnchhcrcomqzlajtltsyubbeorrbjsfbuosnnxpzvenzrdvglljcdesyebjlmkjxkowtbjgafzmczufabcfjsxwztfvnbfrcygdayospxwjrijfddfhnzrpubpltdehladbxrsxasjhshrlhtavhrsszngfhzitugbifvbhdqtuyykhcnekajqpiomahsighikjenlehmixytjwpdfgljgoxnsymoalzphjualeperuszlehgptwxzobwyxmivkcuwyrofikkvngchoyjzokrlioycypsnjunscqoqepmljvznudwiurjwrooedpbrsxmkyjttgfadkupwnwvoytchmkcrboumszfzacfqfsmjbhhlsipiifmljlebmutmoiawwhaglxyjivcjhmrdepvbvvpxaoobnljdfapaqrkmxhlldvpzcmrvfkdhhenhlpluabymdlsapvjtxuwatnashkbtghtlcmjnznrjvfcuzojrvahgrgghedgtpxazqyoddqkhyuhhqzfnsjvxlyhnwpnzufvblhqbskcuuphqphhxtobkgltucugualskvgdxoilapmlnunndzkxojxinrymkbesjsuiiiibkifwbtqfvdzshfagnxlyktbyqricwfddshruhslkinrwpytjvocengdrdanuwtcjflylhjfrgsxnhoijwfssytteytgvpjngsgamkojhfwzwoxvuvdbjbnknwamyqkuzwpeyqvplzfbkfgbgindbpyjvhcqenrkibawazvpqqkszzuwfkxbryluapmjgvmgsbthplrchuxcrasogafacipuvbravdnvmilwklxvdzeiuihhaenqerakpyqjbjdohiuxntixlmysbbuebobwapiwrlanvekkwnjsiykzutfhphgpvuvnhffsgiywyajqrtcrasxnjobwygiykivyemegqwwtdxluiedgatkpdgiwknopabdhabzyhodxaxizlceydgebtbynpencvsnupkuiaglyompolauunqrjzqejffrxdfmqupmsaskddawwckyvsomilkwtcqxusgltxqclxobjmkmevxxzdtxebtmyrrnkvvdmqwhzmmfltbisnaroczrhcmntnbtrzvrhghcnrclpnpvzzhmlmuhoduntjkgrddjibfimfdtahpkqofmaurocgsdtcuqcxjxvgztsdyhugszqsgzsxolbnsxkfgbjbbncfokhlwshpclrgzkqupfxvmsdzlusddygxtejgndkxxtytvbaflekkdxqpetutyciuowuquledlzsppeeljshnhwtnxunxthmwkbiqkpjrdxvcxzgkrmkjlckolipfnuhvqaopxwszgyysvzqbqkczfalynnuwebkaodqhzybayudolnewepfwtizztxxlffcjbzqxmbopmidojhisaesjbdlknrrnatcaipwpypcqndcuvyjyqjqvmqdfgtwfeutkkcjuufrthsejmuhjytvssxybqkyzvxhtwunaxhfssalbognghruhpjoggxsgledypiblcbztxeoydhkredoryiuffccreilltvqgosxyymsjiiubxqcoqegzntzkrdhvklzkjcmxsjlkxwikbomyggpqodceepdundvhxgqqckbxikjywxtcjsfhranlrrlnpgnaqtsmfqxtxvsbvexyxapfeyazcjjrenkjoturtojwdsbouhyuzgwxzezdxbbcvcynxfwpzijhzjwlvhmcdswlmktlhyevxacayzhnxbmjfdsfdkzsibgqkrkkeoxqzpibuupcomvuluyymhubzqaihhfoikpaoeoyalfozhnnkxypdahzmqsvwpqxthxkgfnodocfqsshiekwatyajougqmqmvbmjkjolzgrhwlazxzvijwmicpweclbcciocjvnwpqnnwfmyurvrgegyrrcfnklpkugvpunlznebolwobvkzwagwtpcmxwwajwidtzeizyzlvpskypevpqkcannbggiewkdnrflywgyodcbephdswxxcixpmlcfkvnpadrjrapwapxgrugkbxkyzjkpxkonyjouyiidkmiclszungkehcpheoggzsovblodffwesalzypasxemflulhzrctyhlpiuxljzjzkeeqpxbakerukgvmfdxvaiyelenhayublpigairyejfmhtvwvoipggzktnbciapyyqotshzifhhregoczdsrqbotiskytndypoprjftbwgfstbthcfyxsedoclzutvbavsuebdyqqhlzmcplamqkfvpnqgpqjjeudwpshqtxtavggegbkklkkllpfjgyejtxfqguibfudnlwaijbpvqjdldqyoiapahtuqvrtfvinjingdcsqdvxqechnvhlnjhikukgkcvckubrctzoovharvsgiqoqhwovmprwhbzoknyneawwpltpjjeshaowhxqatuuacqeaxrqubgslextxrzmzykhmvxeapbwbkgczbnsstgksutqmdgicxdcudvjwkttuejseojtynenajvjczdyqgedenmevstyvunqftrvdathyittrgwdgopxykycmnrooldlbqyvwcaphaftwlbuejcqiowugywinmlsdiejupfdwmiwrykdmheuybrqwofltpjancnlxfufgjajcfnlzqqequjxrildtxanpfktzavcpiijxznvsqhhfzsufviiocwbthrmhovkmbadlbfpovnmnwrjibluqssteuafivboibxaqaoitshijhzjecbbnrsbwrnqdqvsrsmwurycewmobvtabeuyisgmoquoamxxdgicjkauhuoozyeiaghktgshlpvujyplwtejilrqyghtfbiddlbftlwqfqxdcgdcgnbdbvkgxjermjnywgysjizovlydenfpyzayzrnefotsgcszrockxtexwhtkzxetjqjcrkzdakyvddupplycpjmslkhgkcwvlirkbsiskxvkojpyxbfwatqgjpslbhqjqrfolxgmlhinneinpopzzcsqdlzfjafffsfrtnyrxqkzdocddjeocywcjavmkkflxnlzgrsbghfemnjurrshqrkpedopzlvxlflzlihcnzvkeytdqnuqnfxsvygaqbisfpqxfoekpznmdfqearhylzlrjdavjitdxjusrikmbhbovgdjwgssprfbnemxdfbzllxbjcptbuyvdwllihtemtpsnutluwlkjecrhowmkkhmncbouadepwdijdnnhcroshetmawfgjplkpkfzrdxscnbwuyqqnzwfrrcrsjonweoiprdwueictyydsjrhkoaxjjotrsodyemxpaiuplucpcokoinikabktzhxtrmdbnemccfseunkaiydvmmswiefoopuvtiouzafqmcthkisliuwtpjrogigozmkylvbggpjhfogdtbmivrbetrzvwthcqsefckmzbaiysnqhnksxyvvzrqomcydruxdscdhhxfoaoabpqnlvupbmcyicoygidpvvgaflbyvgagsbcprkspltvdqmtotrhzjpadobkhlovjyoqeyauzbgddkdhhcnnabsssjrnsouvmvxcojutgvgxbwapygzqnqjaxeexonpjdwzeisqwpakxttpfcqskketybpbrbawkrpdcmkwiwzlnqucjyl")));
    }
}
