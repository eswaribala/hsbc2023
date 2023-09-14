export const items=[
    {
        label: 'Banking',
        icon: 'pi pi-fw pi-money-bill',
        items: [
            {
                label: 'CreditCards',
                icon: 'pi pi-fw pi-credit-card',
                items: [
                    {
                        label: 'Cashback Card',
                        icon: 'pi pi-fw pi-briefcase',
                        command: () => { window.location.href = "/Cashback-Card" }
                    },
                    {
                        label: 'Visa Platinum Card',
                        icon: 'pi pi-fw pi-briefcase'
                    },
                    {
                        label: 'Smart Value Card',
                        icon: 'pi pi-fw pi-briefcase'
                    },
                    {
                        label: 'Compare Card',
                        icon: 'pi pi-fw pi-briefcase'
                    },
                ]
            },
            {
                label: 'CreditCard Features',
                icon: 'pi pi-fw pi-credit-card'
            },
            {
                separator: true
            },
            {
                label: 'Bank Accounts',
                icon: 'pi pi-fw pi-external-link',
                items:[
                    {
                        label: 'Savings Account',
                        icon: 'pi pi-fw pi-briefcase'
                    },

                    {
                        label: 'Fixed Deposit',
                        icon: 'pi pi-fw pi-briefcase'
                    },
                    {
                        label: 'Debit Card',
                        icon: 'pi pi-fw pi-briefcase'
                    },
                ]
            }
        ]
    },

    {
        label: 'Borrowing',
        icon: 'pi pi-fw pi-money-bill',
        items:[{

                label: 'Home Loans',
                icon: 'pi pi-fw pi-briefcase',
                items:[{
                    label: 'Loan Against Property',
                    icon: 'pi pi-fw pi-briefcase',
                },
                    {
                        label: 'NRI Home Loan',
                        icon: 'pi pi-fw pi-briefcase',
                    },

                ]
             },
                {

                    label: 'Personal Loans',
                    icon: 'pi pi-fw pi-briefcase'
                }


        ]


    },

    {
        label: 'Investments',
        icon: 'pi pi-fw pi-money-bill',
        items:[{

            label: 'Digital Wealth',
            icon: 'pi pi-fw pi-briefcase',
            items:[{
                label: 'Wealth Management',
                icon: 'pi pi-fw pi-briefcase',
            },
                {
                    label: 'Wealth Dashboard',
                    icon: 'pi pi-fw pi-briefcase',
                },

            ]
        },
            {

                label: 'Insights',
                icon: 'pi pi-fw pi-briefcase'
            }


        ]


    },
    {
        label: 'NRI',
        icon: 'pi pi-fw pi-money-bill',
        items:[{

            label: 'Forex',
            icon: 'pi pi-fw pi-briefcase',
            items:[{
                label: 'FX Detail',
                icon: 'pi pi-fw pi-briefcase',
            }
            ]
        },
            {

                label: 'Remittances',
                icon: 'pi pi-fw pi-briefcase',
                items:[{
                    label: 'Global Money Transfers',
                    icon: 'pi pi-fw pi-briefcase',
                }]
            }


        ]


    },
    {
        label: 'Offers',
        icon: 'pi pi-fw pi-money-bill',
        items:[{

            label: 'Credit and Debit Card Offers',
            icon: 'pi pi-fw pi-briefcase',
            items:[{
                label: 'Travel',
                icon: 'pi pi-fw pi-briefcase',
            }
            ]
        },
            {

                label: 'Rewards Programs',
                icon: 'pi pi-fw pi-briefcase',
                items:[{
                    label: 'Global Money Transfers',
                    icon: 'pi pi-fw pi-briefcase',
                }]
            }


        ]


    },
    {
        label: 'Online',
        icon: 'pi pi-fw pi-money-bill',
        items:[{

            label: 'Payments',
            icon: 'pi pi-fw pi-briefcase',
            items:[{
                label: 'Travel',
                icon: 'pi pi-fw pi-briefcase',
            }
            ]
        },
            {

                label: 'Mobile Banking',
                icon: 'pi pi-fw pi-briefcase',
                items:[{
                    label: 'Simply Pay',
                    icon: 'pi pi-fw pi-briefcase',
                }]
            }


        ]


    }



]
